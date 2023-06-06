/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.demo.employee;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

/** Sample schema to help you get started. */
@org.apache.avro.specific.AvroGenerated
public class employeeRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 505543341639671429L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"employeeRecord\",\"namespace\":\"com.demo.employee\",\"doc\":\"Sample schema to help you get started.\",\"fields\":[{\"name\":\"employeeId\",\"type\":\"int\",\"doc\":\"The id of the employee.\"},{\"name\":\"employeeName\",\"type\":\"string\",\"doc\":\"employee name\"},{\"name\":\"address1\",\"type\":\"string\",\"doc\":\"employee address\",\"default\":\"\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<employeeRecord> ENCODER =
      new BinaryMessageEncoder<employeeRecord>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<employeeRecord> DECODER =
      new BinaryMessageDecoder<employeeRecord>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<employeeRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<employeeRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<employeeRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<employeeRecord>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this employeeRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a employeeRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a employeeRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static employeeRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** The id of the employee. */
  @Deprecated public int employeeId;
  /** employee name */
  @Deprecated public java.lang.CharSequence employeeName;
  /** employee address */
  @Deprecated public java.lang.CharSequence address1;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public employeeRecord() {}

  /**
   * All-args constructor.
   * @param employeeId The id of the employee.
   * @param employeeName employee name
   * @param address1 employee address
   */
  public employeeRecord(java.lang.Integer employeeId, java.lang.CharSequence employeeName, java.lang.CharSequence address1) {
    this.employeeId = employeeId;
    this.employeeName = employeeName;
    this.address1 = address1;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return employeeId;
    case 1: return employeeName;
    case 2: return address1;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: employeeId = (java.lang.Integer)value$; break;
    case 1: employeeName = (java.lang.CharSequence)value$; break;
    case 2: address1 = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'employeeId' field.
   * @return The id of the employee.
   */
  public int getEmployeeId() {
    return employeeId;
  }


  /**
   * Sets the value of the 'employeeId' field.
   * The id of the employee.
   * @param value the value to set.
   */
  public void setEmployeeId(int value) {
    this.employeeId = value;
  }

  /**
   * Gets the value of the 'employeeName' field.
   * @return employee name
   */
  public java.lang.CharSequence getEmployeeName() {
    return employeeName;
  }


  /**
   * Sets the value of the 'employeeName' field.
   * employee name
   * @param value the value to set.
   */
  public void setEmployeeName(java.lang.CharSequence value) {
    this.employeeName = value;
  }

  /**
   * Gets the value of the 'address1' field.
   * @return employee address
   */
  public java.lang.CharSequence getAddress1() {
    return address1;
  }


  /**
   * Sets the value of the 'address1' field.
   * employee address
   * @param value the value to set.
   */
  public void setAddress1(java.lang.CharSequence value) {
    this.address1 = value;
  }

  /**
   * Creates a new employeeRecord RecordBuilder.
   * @return A new employeeRecord RecordBuilder
   */
  public static com.demo.employee.employeeRecord.Builder newBuilder() {
    return new com.demo.employee.employeeRecord.Builder();
  }

  /**
   * Creates a new employeeRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new employeeRecord RecordBuilder
   */
  public static com.demo.employee.employeeRecord.Builder newBuilder(com.demo.employee.employeeRecord.Builder other) {
    if (other == null) {
      return new com.demo.employee.employeeRecord.Builder();
    } else {
      return new com.demo.employee.employeeRecord.Builder(other);
    }
  }

  /**
   * Creates a new employeeRecord RecordBuilder by copying an existing employeeRecord instance.
   * @param other The existing instance to copy.
   * @return A new employeeRecord RecordBuilder
   */
  public static com.demo.employee.employeeRecord.Builder newBuilder(com.demo.employee.employeeRecord other) {
    if (other == null) {
      return new com.demo.employee.employeeRecord.Builder();
    } else {
      return new com.demo.employee.employeeRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for employeeRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<employeeRecord>
    implements org.apache.avro.data.RecordBuilder<employeeRecord> {

    /** The id of the employee. */
    private int employeeId;
    /** employee name */
    private java.lang.CharSequence employeeName;
    /** employee address */
    private java.lang.CharSequence address1;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.demo.employee.employeeRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.employeeId)) {
        this.employeeId = data().deepCopy(fields()[0].schema(), other.employeeId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.employeeName)) {
        this.employeeName = data().deepCopy(fields()[1].schema(), other.employeeName);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.address1)) {
        this.address1 = data().deepCopy(fields()[2].schema(), other.address1);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing employeeRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(com.demo.employee.employeeRecord other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.employeeId)) {
        this.employeeId = data().deepCopy(fields()[0].schema(), other.employeeId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.employeeName)) {
        this.employeeName = data().deepCopy(fields()[1].schema(), other.employeeName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.address1)) {
        this.address1 = data().deepCopy(fields()[2].schema(), other.address1);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'employeeId' field.
      * The id of the employee.
      * @return The value.
      */
    public int getEmployeeId() {
      return employeeId;
    }


    /**
      * Sets the value of the 'employeeId' field.
      * The id of the employee.
      * @param value The value of 'employeeId'.
      * @return This builder.
      */
    public com.demo.employee.employeeRecord.Builder setEmployeeId(int value) {
      validate(fields()[0], value);
      this.employeeId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'employeeId' field has been set.
      * The id of the employee.
      * @return True if the 'employeeId' field has been set, false otherwise.
      */
    public boolean hasEmployeeId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'employeeId' field.
      * The id of the employee.
      * @return This builder.
      */
    public com.demo.employee.employeeRecord.Builder clearEmployeeId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'employeeName' field.
      * employee name
      * @return The value.
      */
    public java.lang.CharSequence getEmployeeName() {
      return employeeName;
    }


    /**
      * Sets the value of the 'employeeName' field.
      * employee name
      * @param value The value of 'employeeName'.
      * @return This builder.
      */
    public com.demo.employee.employeeRecord.Builder setEmployeeName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.employeeName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'employeeName' field has been set.
      * employee name
      * @return True if the 'employeeName' field has been set, false otherwise.
      */
    public boolean hasEmployeeName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'employeeName' field.
      * employee name
      * @return This builder.
      */
    public com.demo.employee.employeeRecord.Builder clearEmployeeName() {
      employeeName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'address1' field.
      * employee address
      * @return The value.
      */
    public java.lang.CharSequence getAddress1() {
      return address1;
    }


    /**
      * Sets the value of the 'address1' field.
      * employee address
      * @param value The value of 'address1'.
      * @return This builder.
      */
    public com.demo.employee.employeeRecord.Builder setAddress1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.address1 = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'address1' field has been set.
      * employee address
      * @return True if the 'address1' field has been set, false otherwise.
      */
    public boolean hasAddress1() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'address1' field.
      * employee address
      * @return This builder.
      */
    public com.demo.employee.employeeRecord.Builder clearAddress1() {
      address1 = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public employeeRecord build() {
      try {
        employeeRecord record = new employeeRecord();
        record.employeeId = fieldSetFlags()[0] ? this.employeeId : (java.lang.Integer) defaultValue(fields()[0]);
        record.employeeName = fieldSetFlags()[1] ? this.employeeName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.address1 = fieldSetFlags()[2] ? this.address1 : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<employeeRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<employeeRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<employeeRecord>
    READER$ = (org.apache.avro.io.DatumReader<employeeRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.employeeId);

    out.writeString(this.employeeName);

    out.writeString(this.address1);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.employeeId = in.readInt();

      this.employeeName = in.readString(this.employeeName instanceof Utf8 ? (Utf8)this.employeeName : null);

      this.address1 = in.readString(this.address1 instanceof Utf8 ? (Utf8)this.address1 : null);

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.employeeId = in.readInt();
          break;

        case 1:
          this.employeeName = in.readString(this.employeeName instanceof Utf8 ? (Utf8)this.employeeName : null);
          break;

        case 2:
          this.address1 = in.readString(this.address1 instanceof Utf8 ? (Utf8)this.address1 : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










