package matcheam.entry;

import matcheam.jooq.generate.tables.records.EntryRecord;
import matcheam.jooq.generate.tables.records.EntryUserRecord;
import matcheam.match.Identifier;
import matcheam.match.Match;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static matcheam.jooq.generate.Tables.ENTRY;
import static matcheam.jooq.generate.Tables.ENTRY_USER;
import static org.jooq.impl.DSL.trueCondition;

@Repository
public class EntryRepository {
    public EntryRepository(DSLContext dsl) {
        this.dsl = dsl;
    }

    DSLContext dsl;

    /**
     * １件のentryを登録します。
     *
     * @param entry 　Entryインスタンス
     * @throws Exception 登録が失敗した場合
     */
    Entry register(Entry entry) throws Exception {
        int entryIdentifier;

        //TODO:本当の判断条件を入れる
        if (true) {
            EntryRecord entryRecord = dsl.insertInto(ENTRY)
                    .columns(ENTRY.MATCHID)
                    .values(entry.getMatch().getIdentifier().value())
                    .returning(ENTRY.IDENTIFIER)
                    .fetchOne();
            entryIdentifier = entryRecord.getIdentifier();
        }

        dsl.insertInto(ENTRY_USER)
                .columns(ENTRY_USER.ENTRYID, ENTRY_USER.ENTRYUSERNAME)
                .values(entryIdentifier, entry.getEntryUserList().get(0).getEntryUserName())
                .execute();

        entry.setIdentifier(Identifier.of(entryIdentifier));
        return entry;
    }



    /**
     * 主キーで検索します。
     * <p>条件に一致しない場合、nullを返します。</p>
     * @param entry 募集
     * @return 募集
     * @throws Exception 検索が失敗した場合
     */
    public Entry findBy(Entry entry) throws Exception {
        Condition condition = trueCondition();
        EntryRecord record = dsl.selectFrom(ENTRY)
                .where(condition.and(ENTRY.IDENTIFIER.equal(entry.getIdentifier().value())))
                .fetchOne();
        if (record == null) {
            return null;
        }

        Result<EntryUserRecord> entryUserRecords = dsl.selectFrom(ENTRY_USER)
                .where(condition.and(ENTRY_USER.ENTRYID.equal(entry.getIdentifier().value())))
                .fetch();

        return makeEntry(record,entryUserRecords);
    }


    /**
     * EntryRecord のインスタンスから Entry のインスタンスを生成します。
     * @param record　EntryRecord のインスタンス
     * @param entryUserRecords Result<EntryUserRecord> のインスタンス
     * @return　Entry のインスタンス
     */
    private Entry makeEntry(EntryRecord record, Result<EntryUserRecord> entryUserRecords) {
        List<EntryUser> entryUserList = new ArrayList<>();
        for (EntryUserRecord entryUserRecord : entryUserRecords) {
            String entryUserName = entryUserRecord.getEntryusername();
            entryUserList.add(new EntryUser(entryUserName));
        }
        return new Entry(Identifier.of(record.getIdentifier()), Match.of(Identifier.of(record.getMatchid())),entryUserList);
    }

}
