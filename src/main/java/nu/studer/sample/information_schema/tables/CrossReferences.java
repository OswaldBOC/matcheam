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
public class CrossReferences extends org.jooq.impl.TableImpl<nu.studer.sample.information_schema.tables.records.CrossReferencesRecord> {

	private static final long serialVersionUID = -893364368;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.CROSS_REFERENCES</code>
	 */
	public static final nu.studer.sample.information_schema.tables.CrossReferences CROSS_REFERENCES = new nu.studer.sample.information_schema.tables.CrossReferences();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<nu.studer.sample.information_schema.tables.records.CrossReferencesRecord> getRecordType() {
		return nu.studer.sample.information_schema.tables.records.CrossReferencesRecord.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_CATALOG</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.CrossReferencesRecord, java.lang.String> PKTABLE_CATALOG = createField("PKTABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_SCHEMA</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.CrossReferencesRecord, java.lang.String> PKTABLE_SCHEMA = createField("PKTABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_NAME</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.CrossReferencesRecord, java.lang.String> PKTABLE_NAME = createField("PKTABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKCOLUMN_NAME</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.CrossReferencesRecord, java.lang.String> PKCOLUMN_NAME = createField("PKCOLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_CATALOG</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.CrossReferencesRecord, java.lang.String> FKTABLE_CATALOG = createField("FKTABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_SCHEMA</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.CrossReferencesRecord, java.lang.String> FKTABLE_SCHEMA = createField("FKTABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_NAME</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.CrossReferencesRecord, java.lang.String> FKTABLE_NAME = createField("FKTABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKCOLUMN_NAME</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.CrossReferencesRecord, java.lang.String> FKCOLUMN_NAME = createField("FKCOLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.ORDINAL_POSITION</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.CrossReferencesRecord, java.lang.Short> ORDINAL_POSITION = createField("ORDINAL_POSITION", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.UPDATE_RULE</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.CrossReferencesRecord, java.lang.Short> UPDATE_RULE = createField("UPDATE_RULE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.DELETE_RULE</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.CrossReferencesRecord, java.lang.Short> DELETE_RULE = createField("DELETE_RULE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FK_NAME</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.CrossReferencesRecord, java.lang.String> FK_NAME = createField("FK_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PK_NAME</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.CrossReferencesRecord, java.lang.String> PK_NAME = createField("PK_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.CROSS_REFERENCES.DEFERRABILITY</code>.
	 */
	public final org.jooq.TableField<nu.studer.sample.information_schema.tables.records.CrossReferencesRecord, java.lang.Short> DEFERRABILITY = createField("DEFERRABILITY", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * Create a <code>INFORMATION_SCHEMA.CROSS_REFERENCES</code> table reference
	 */
	public CrossReferences() {
		this("CROSS_REFERENCES", null);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.CROSS_REFERENCES</code> table reference
	 */
	public CrossReferences(java.lang.String alias) {
		this(alias, nu.studer.sample.information_schema.tables.CrossReferences.CROSS_REFERENCES);
	}

	private CrossReferences(java.lang.String alias, org.jooq.Table<nu.studer.sample.information_schema.tables.records.CrossReferencesRecord> aliased) {
		this(alias, aliased, null);
	}

	private CrossReferences(java.lang.String alias, org.jooq.Table<nu.studer.sample.information_schema.tables.records.CrossReferencesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, nu.studer.sample.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public nu.studer.sample.information_schema.tables.CrossReferences as(java.lang.String alias) {
		return new nu.studer.sample.information_schema.tables.CrossReferences(alias, this);
	}

	/**
	 * Rename this table
	 */
	public nu.studer.sample.information_schema.tables.CrossReferences rename(java.lang.String name) {
		return new nu.studer.sample.information_schema.tables.CrossReferences(name, null);
	}
}
