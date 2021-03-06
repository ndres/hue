/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.thriftfs.jobtracker.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Container structure of a list of jobs, in case we ever want to add metadata
 */
public class ThriftJobList implements org.apache.thrift.TBase<ThriftJobList, ThriftJobList._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftJobList");

  private static final org.apache.thrift.protocol.TField JOBS_FIELD_DESC = new org.apache.thrift.protocol.TField("jobs", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftJobListStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftJobListTupleSchemeFactory());
  }

  public List<ThriftJobInProgress> jobs; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JOBS((short)1, "jobs");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // JOBS
          return JOBS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOBS, new org.apache.thrift.meta_data.FieldMetaData("jobs", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftJobInProgress.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftJobList.class, metaDataMap);
  }

  public ThriftJobList() {
  }

  public ThriftJobList(
    List<ThriftJobInProgress> jobs)
  {
    this();
    this.jobs = jobs;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftJobList(ThriftJobList other) {
    if (other.isSetJobs()) {
      List<ThriftJobInProgress> __this__jobs = new ArrayList<ThriftJobInProgress>();
      for (ThriftJobInProgress other_element : other.jobs) {
        __this__jobs.add(new ThriftJobInProgress(other_element));
      }
      this.jobs = __this__jobs;
    }
  }

  public ThriftJobList deepCopy() {
    return new ThriftJobList(this);
  }

  @Override
  public void clear() {
    this.jobs = null;
  }

  public int getJobsSize() {
    return (this.jobs == null) ? 0 : this.jobs.size();
  }

  public java.util.Iterator<ThriftJobInProgress> getJobsIterator() {
    return (this.jobs == null) ? null : this.jobs.iterator();
  }

  public void addToJobs(ThriftJobInProgress elem) {
    if (this.jobs == null) {
      this.jobs = new ArrayList<ThriftJobInProgress>();
    }
    this.jobs.add(elem);
  }

  public List<ThriftJobInProgress> getJobs() {
    return this.jobs;
  }

  public ThriftJobList setJobs(List<ThriftJobInProgress> jobs) {
    this.jobs = jobs;
    return this;
  }

  public void unsetJobs() {
    this.jobs = null;
  }

  /** Returns true if field jobs is set (has been assigned a value) and false otherwise */
  public boolean isSetJobs() {
    return this.jobs != null;
  }

  public void setJobsIsSet(boolean value) {
    if (!value) {
      this.jobs = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JOBS:
      if (value == null) {
        unsetJobs();
      } else {
        setJobs((List<ThriftJobInProgress>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOBS:
      return getJobs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JOBS:
      return isSetJobs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftJobList)
      return this.equals((ThriftJobList)that);
    return false;
  }

  public boolean equals(ThriftJobList that) {
    if (that == null)
      return false;

    boolean this_present_jobs = true && this.isSetJobs();
    boolean that_present_jobs = true && that.isSetJobs();
    if (this_present_jobs || that_present_jobs) {
      if (!(this_present_jobs && that_present_jobs))
        return false;
      if (!this.jobs.equals(that.jobs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ThriftJobList other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ThriftJobList typedOther = (ThriftJobList)other;

    lastComparison = Boolean.valueOf(isSetJobs()).compareTo(typedOther.isSetJobs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobs, typedOther.jobs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftJobList(");
    boolean first = true;

    sb.append("jobs:");
    if (this.jobs == null) {
      sb.append("null");
    } else {
      sb.append(this.jobs);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ThriftJobListStandardSchemeFactory implements SchemeFactory {
    public ThriftJobListStandardScheme getScheme() {
      return new ThriftJobListStandardScheme();
    }
  }

  private static class ThriftJobListStandardScheme extends StandardScheme<ThriftJobList> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftJobList struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOBS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list94 = iprot.readListBegin();
                struct.jobs = new ArrayList<ThriftJobInProgress>(_list94.size);
                for (int _i95 = 0; _i95 < _list94.size; ++_i95)
                {
                  ThriftJobInProgress _elem96; // required
                  _elem96 = new ThriftJobInProgress();
                  _elem96.read(iprot);
                  struct.jobs.add(_elem96);
                }
                iprot.readListEnd();
              }
              struct.setJobsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftJobList struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.jobs != null) {
        oprot.writeFieldBegin(JOBS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.jobs.size()));
          for (ThriftJobInProgress _iter97 : struct.jobs)
          {
            _iter97.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftJobListTupleSchemeFactory implements SchemeFactory {
    public ThriftJobListTupleScheme getScheme() {
      return new ThriftJobListTupleScheme();
    }
  }

  private static class ThriftJobListTupleScheme extends TupleScheme<ThriftJobList> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftJobList struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetJobs()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetJobs()) {
        {
          oprot.writeI32(struct.jobs.size());
          for (ThriftJobInProgress _iter98 : struct.jobs)
          {
            _iter98.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftJobList struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list99 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.jobs = new ArrayList<ThriftJobInProgress>(_list99.size);
          for (int _i100 = 0; _i100 < _list99.size; ++_i100)
          {
            ThriftJobInProgress _elem101; // required
            _elem101 = new ThriftJobInProgress();
            _elem101.read(iprot);
            struct.jobs.add(_elem101);
          }
        }
        struct.setJobsIsSet(true);
      }
    }
  }

}

