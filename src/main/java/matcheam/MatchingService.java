package matcheam;

import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * Created by ooguro on 2017/01/07.
 */
@Service
public class MatchingService {

    // TODO 永続化する
    public HashMap<String, Matching> matchingMap = new HashMap<>();


    public void apply(Match match, EntryUser entryUser) {
        Matching matching = new Matching(match);
        for (Matching m : matchingMap.values()) {
            if (m.getMatch().equals(match)) {
                matching = m;
                break;
            }
        }
        matching.entry(entryUser);
        matchingMap.put(matching.getIdentifier().toString(), matching);
    }

    public Matching findOne(Match match) {
        for (Matching matching : matchingMap.values()) {
            if (matching.getMatch().equals(match)) {
                return matching;
            }
        }
        //TODO 見つからなかった場合は仮にnull
        return null;
    }
}