/**
 * This class is generated by jOOQ
 */
package nu.studer.sample.information_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SequencesRecord extends org.jooq.impl.TableRecordImpl<nu.studer.sample.information_schema.tables.records.SequencesRecord> implements org.jooq.Record12<java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Boolean, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Boolean, java.lang.Integer> {

	private static final long serialVersionUID = -509381677;

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.SEQUENCE_CATALOG</code>.
	 */
	public void setSequenceCatalog(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.SEQUENCE_CATALOG</code>.
	 */
	public java.lang.String getSequenceCatalog() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.SEQUENCE_SCHEMA</code>.
	 */
	public void setSequenceSchema(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.SEQUENCE_SCHEMA</code>.
	 */
	public java.lang.String getSequenceSchema() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.SEQUENCE_NAME</code>.
	 */
	public void setSequenceName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.SEQUENCE_NAME</code>.
	 */
	public java.lang.String getSequenceName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.CURRENT_VALUE</code>.
	 */
	public void setCurrentValue(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.CURRENT_VALUE</code>.
	 */
	public java.lang.Long getCurrentValue() {
		return (java.lang.Long) getValue(3);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.INCREMENT</code>.
	 */
	public void setIncrement(java.lang.Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.INCREMENT</code>.
	 */
	public java.lang.Long getIncrement() {
		return (java.lang.Long) getValue(4);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.IS_GENERATED</code>.
	 */
	public void setIsGenerated(java.lang.Boolean value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.IS_GENERATED</code>.
	 */
	public java.lang.Boolean getIsGenerated() {
		return (java.lang.Boolean) getValue(5);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.REMARKS</code>.
	 */
	public void setRemarks(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.REMARKS</code>.
	 */
	public java.lang.String getRemarks() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.CACHE</code>.
	 */
	public void setCache(java.lang.Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.CACHE</code>.
	 */
	public java.lang.Long getCache() {
		return (java.lang.Long) getValue(7);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.MIN_VALUE</code>.
	 */
	public void setMinValue(java.lang.Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.MIN_VALUE</code>.
	 */
	public java.lang.Long getMinValue() {
		return (java.lang.Long) getValue(8);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.MAX_VALUE</code>.
	 */
	public void setMaxValue(java.lang.Long value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.MAX_VALUE</code>.
	 */
	public java.lang.Long getMaxValue() {
		return (java.lang.Long) getValue(9);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.IS_CYCLE</code>.
	 */
	public void setIsCycle(java.lang.Boolean value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.IS_CYCLE</code>.
	 */
	public java.lang.Boolean getIsCycle() {
		return (java.lang.Boolean) getValue(10);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.ID</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.ID</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(11);
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Boolean, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Boolean, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Boolean, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Boolean, java.lang.Integer> valuesRow() {
		return (org.jooq.Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return nu.studer.sample.information_schema.tables.Sequences.SEQUENCES.SEQUENCE_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return nu.studer.sample.information_schema.tables.Sequences.SEQUENCES.SEQUENCE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return nu.studer.sample.information_schema.tables.Sequences.SEQUENCES.SEQUENCE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return nu.studer.sample.information_schema.tables.Sequences.SEQUENCES.CURRENT_VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field5() {
		return nu.studer.sample.information_schema.tables.Sequences.SEQUENCES.INCREMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field6() {
		return nu.studer.sample.information_schema.tables.Sequences.SEQUENCES.IS_GENERATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return nu.studer.sample.information_schema.tables.Sequences.SEQUENCES.REMARKS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field8() {
		return nu.studer.sample.information_schema.tables.Sequences.SEQUENCES.CACHE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field9() {
		return nu.studer.sample.information_schema.tables.Sequences.SEQUENCES.MIN_VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field10() {
		return nu.studer.sample.information_schema.tables.Sequences.SEQUENCES.MAX_VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field11() {
		return nu.studer.sample.information_schema.tables.Sequences.SEQUENCES.IS_CYCLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field12() {
		return nu.studer.sample.information_schema.tables.Sequences.SEQUENCES.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getSequenceCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getSequenceSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getSequenceName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return getCurrentValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value5() {
		return getIncrement();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value6() {
		return getIsGenerated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getRemarks();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value8() {
		return getCache();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value9() {
		return getMinValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value10() {
		return getMaxValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value11() {
		return getIsCycle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value12() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SequencesRecord value1(java.lang.String value) {
		setSequenceCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SequencesRecord value2(java.lang.String value) {
		setSequenceSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SequencesRecord value3(java.lang.String value) {
		setSequenceName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SequencesRecord value4(java.lang.Long value) {
		setCurrentValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SequencesRecord value5(java.lang.Long value) {
		setIncrement(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SequencesRecord value6(java.lang.Boolean value) {
		setIsGenerated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SequencesRecord value7(java.lang.String value) {
		setRemarks(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SequencesRecord value8(java.lang.Long value) {
		setCache(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SequencesRecord value9(java.lang.Long value) {
		setMinValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SequencesRecord value10(java.lang.Long value) {
		setMaxValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SequencesRecord value11(java.lang.Boolean value) {
		setIsCycle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SequencesRecord value12(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SequencesRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.Long value4, java.lang.Long value5, java.lang.Boolean value6, java.lang.String value7, java.lang.Long value8, java.lang.Long value9, java.lang.Long value10, java.lang.Boolean value11, java.lang.Integer value12) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SequencesRecord
	 */
	public SequencesRecord() {
		super(nu.studer.sample.information_schema.tables.Sequences.SEQUENCES);
	}

	/**
	 * Create a detached, initialised SequencesRecord
	 */
	public SequencesRecord(java.lang.String sequenceCatalog, java.lang.String sequenceSchema, java.lang.String sequenceName, java.lang.Long currentValue, java.lang.Long increment, java.lang.Boolean isGenerated, java.lang.String remarks, java.lang.Long cache, java.lang.Long minValue, java.lang.Long maxValue, java.lang.Boolean isCycle, java.lang.Integer id) {
		super(nu.studer.sample.information_schema.tables.Sequences.SEQUENCES);

		setValue(0, sequenceCatalog);
		setValue(1, sequenceSchema);
		setValue(2, sequenceName);
		setValue(3, currentValue);
		setValue(4, increment);
		setValue(5, isGenerated);
		setValue(6, remarks);
		setValue(7, cache);
		setValue(8, minValue);
		setValue(9, maxValue);
		setValue(10, isCycle);
		setValue(11, id);
	}
}
