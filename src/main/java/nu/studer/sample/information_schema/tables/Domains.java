/**
 * This class is generated by jOOQ
 */
package nu.studer.sample.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Domains extends org.jooq.impl.TableImpl<nu.studer.sample.information_schema.tables.records.DomainsRecord> {

	private static final long serialVersionUID = -616940727;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.DOMAINS</code>
	 */
	public static final nu.studer.sample.information_schema.tables.Domains DOMAINS = new nu.studer.sample.information_schema.tables.Domains();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<nu.studer.sample.information_schema.tables.records.DomainsRecord> getRecordType() {
		return nu.studer.sample.information_schema.tables.records.DomainsRecord.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.DOMAINS.DOMAIN_CATALOG</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.DomainsRecord, java.lang.String> DOMAIN_CATALOG = createField("DOMAIN_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.DOMAINS.DOMAIN_SCHEMA</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.DomainsRecord, java.lang.String> DOMAIN_SCHEMA = createField("DOMAIN_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.DOMAINS.DOMAIN_NAME</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.DomainsRecord, java.lang.String> DOMAIN_NAME = createField("DOMAIN_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.DOMAINS.COLUMN_DEFAULT</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.DomainsRecord, java.lang.String> COLUMN_DEFAULT = createField("COLUMN_DEFAULT", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.DOMAINS.IS_NULLABLE</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.DomainsRecord, java.lang.String> IS_NULLABLE = createField("IS_NULLABLE", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.DOMAINS.DATA_TYPE</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.DomainsRecord, java.lang.Integer> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.DOMAINS.PRECISION</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.DomainsRecord, java.lang.Integer> PRECISION = createField("PRECISION", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.DOMAINS.SCALE</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.DomainsRecord, java.lang.Integer> SCALE = createField("SCALE", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.DOMAINS.TYPE_NAME</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.DomainsRecord, java.lang.String> TYPE_NAME = createField("TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.DOMAINS.SELECTIVITY</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.DomainsRecord, java.lang.Integer> SELECTIVITY = createField("SELECTIVITY", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.DOMAINS.CHECK_CONSTRAINT</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.DomainsRecord, java.lang.String> CHECK_CONSTRAINT = createField("CHECK_CONSTRAINT", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.DOMAINS.REMARKS</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.DomainsRecord, java.lang.String> REMARKS = createField("REMARKS", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.DOMAINS.SQL</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.DomainsRecord, java.lang.String> SQL = createField("SQL", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.DOMAINS.ID</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.DomainsRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>INFORMATION_SCHEMA.DOMAINS</code> table reference
	 */
	public Domains() {
		this("DOMAINS", null);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.DOMAINS</code> table reference
	 */
	public Domains(java.lang.String alias) {
		this(alias, nu.studer.sample.information_schema.tables.Domains.DOMAINS);
	}

	private Domains(java.lang.String alias, org.jooq.Table<nu.studer.sample.information_schema.tables.records.DomainsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Domains(java.lang.String alias, org.jooq.Table<nu.studer.sample.information_schema.tables.records.DomainsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, nu.studer.sample.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public nu.studer.sample.information_schema.tables.Domains as(java.lang.String alias) {
		return new nu.studer.sample.information_schema.tables.Domains(alias, this);
	}

	/**
	 * Rename this table
	 */
	public nu.studer.sample.information_schema.tables.Domains rename(java.lang.String name) {
		return new nu.studer.sample.information_schema.tables.Domains(name, null);
	}
}
