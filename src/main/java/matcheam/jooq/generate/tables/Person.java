/**
 * This class is generated by jOOQ
 */
package matcheam.jooq.generate.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Person extends org.jooq.impl.TableImpl<matcheam.jooq.generate.tables.records.PersonRecord> {

	private static final long serialVersionUID = -1204899081;

	/**
	 * The singleton instance of <code>matcheam.person</code>
	 */
	public static final matcheam.jooq.generate.tables.Person PERSON = new matcheam.jooq.generate.tables.Person();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<matcheam.jooq.generate.tables.records.PersonRecord> getRecordType() {
		return matcheam.jooq.generate.tables.records.PersonRecord.class;
	}

	/**
	 * The column <code>matcheam.person.id</code>.
	 */
	public final org.jooq.TableField<matcheam.jooq.generate.tables.records.PersonRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>matcheam.person.name</code>.
	 */
	public final org.jooq.TableField<matcheam.jooq.generate.tables.records.PersonRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * Create a <code>matcheam.person</code> table reference
	 */
	public Person() {
		this("person", null);
	}

	/**
	 * Create an aliased <code>matcheam.person</code> table reference
	 */
	public Person(java.lang.String alias) {
		this(alias, matcheam.jooq.generate.tables.Person.PERSON);
	}

	private Person(java.lang.String alias, org.jooq.Table<matcheam.jooq.generate.tables.records.PersonRecord> aliased) {
		this(alias, aliased, null);
	}

	private Person(java.lang.String alias, org.jooq.Table<matcheam.jooq.generate.tables.records.PersonRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, matcheam.jooq.generate.Matcheam.MATCHEAM, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public matcheam.jooq.generate.tables.Person as(java.lang.String alias) {
		return new matcheam.jooq.generate.tables.Person(alias, this);
	}

	/**
	 * Rename this table
	 */
	public matcheam.jooq.generate.tables.Person rename(java.lang.String name) {
		return new matcheam.jooq.generate.tables.Person(name, null);
	}
}