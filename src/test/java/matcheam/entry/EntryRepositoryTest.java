package matcheam.entry;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.operation.Operation;
import matcheam.match.Identifier;
import matcheam.match.Match;
import matcheam.support.TestContext;
import org.junit.Before;
import org.junit.Test;

import static com.ninja_squad.dbsetup.Operations.deleteAllFrom;
import static com.ninja_squad.dbsetup.Operations.sequenceOf;

public class EntryRepositoryTest {
    private TestContext testContext;

    EntryRepository sut;

    @Before
    public void setUp() throws Exception {
        testContext = new TestContext();
        sut = new EntryRepository(testContext.dslContext());
        Operation deleteAll = sequenceOf(
                deleteAllFrom("MATCHEAM.ENTRY_USER"),
                deleteAllFrom("MATCHEAM.ENTRY")
        );
        DbSetup dbSetup = new DbSetup(testContext.driverManagerDestination(), deleteAll);
        dbSetup.launch();
    }

    @Test
    public void 一件の応募の登録ができること() throws Exception {
        Match match = new Match();
        match.setIdentifier(new Identifier(3));

        Entry entry = new Entry();
        entry.setMatch(match);

        sut.register(entry);
    }

}