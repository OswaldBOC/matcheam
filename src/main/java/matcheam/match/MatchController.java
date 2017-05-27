package matcheam.match;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import matcheam.matching.Matching;
import matcheam.matching.MatchingService;
import matcheam.person.Person;
import matcheam.person.PersonService;

/**
 * Created by ooguro on 2017/01/21.
 */
@Controller
@RequestMapping("/match")
public class MatchController {
	@Autowired
	MatchService matchService;

	@Autowired
	MatchingService matchingService;

	@Autowired
	PersonService entryUserService;

	@ModelAttribute("match")
	Match match() {
		return new Match();
	}

	@GetMapping("register")
	String show() {
		return "/match/register";
	}

	@PostMapping("result")
	String execute(@ModelAttribute("match") Match match, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return show();
		}
		matchService.register(match);
		return "/match/result";
	}

	/**
	 * 検索します。
	 * @param model テンプレートが表示するときに使う情報の設定先
	 * @param level レベル
	 * @return 表示するテンプレート
	 */
	@RequestMapping("/search")
	public String search(Model model, @RequestParam(required = false) String level) {
		if (level == null || level.isEmpty()) {
			Collection<Match> matches = matchService.findAll();
			model.addAttribute("level", "");
			model.addAttribute("matches", matches);
			return "match/search";
		}
		try {
			Collection<Match> matches = matchService.findByLevel(Level.valueOf(level));
			model.addAttribute("level", level);
			model.addAttribute("matches", matches);
		} catch (IllegalArgumentException e) {
			model.addAttribute("level", level);
			model.addAttribute("matches", new ArrayList<Match>());
		}
		return "match/search";
	}

	@GetMapping("matching/{matchId}")
	public String matching(Model model, @ModelAttribute("entryName") String name, @PathVariable String matchId) {
		Match match = matchService.findBy(new Identifier(matchId));
		Person entryUser = new Person(name);
		matchingService.matching(match, entryUser);
		detail(model, matchId);
		return "match/detail";
	}

	@GetMapping("detail/{matchId}")
	public String detail(Model model, @PathVariable String matchId) {
		Match match = matchService.findBy(new Identifier(matchId));
		model.addAttribute(match);
		Matching matching = matchingService.get(match);
		// TODO 永続化できたら null 考慮しないように修正する
		if (matching == null) {
			model.addAttribute("entryUsers", Collections.emptyList());
		} else {
			model.addAttribute("entryUsers", matching.getEntryUsers());
		}
		return "match/detail";
	}
}