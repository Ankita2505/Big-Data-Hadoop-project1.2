// ORM class for table 'state80percent'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Nov 29 01:20:08 PST 2017
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class state80percent extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("State", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        State = (String)value;
      }
    });
    setters.put("district", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        district = (String)value;
      }
    });
    setters.put("BPL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        BPL = (Integer)value;
      }
    });
    setters.put("total", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        total = (Integer)value;
      }
    });
  }
  public state80percent() {
    init0();
  }
  private String State;
  public String get_State() {
    return State;
  }
  public void set_State(String State) {
    this.State = State;
  }
  public state80percent with_State(String State) {
    this.State = State;
    return this;
  }
  private String district;
  public String get_district() {
    return district;
  }
  public void set_district(String district) {
    this.district = district;
  }
  public state80percent with_district(String district) {
    this.district = district;
    return this;
  }
  private Integer BPL;
  public Integer get_BPL() {
    return BPL;
  }
  public void set_BPL(Integer BPL) {
    this.BPL = BPL;
  }
  public state80percent with_BPL(Integer BPL) {
    this.BPL = BPL;
    return this;
  }
  private Integer total;
  public Integer get_total() {
    return total;
  }
  public void set_total(Integer total) {
    this.total = total;
  }
  public state80percent with_total(Integer total) {
    this.total = total;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof state80percent)) {
      return false;
    }
    state80percent that = (state80percent) o;
    boolean equal = true;
    equal = equal && (this.State == null ? that.State == null : this.State.equals(that.State));
    equal = equal && (this.district == null ? that.district == null : this.district.equals(that.district));
    equal = equal && (this.BPL == null ? that.BPL == null : this.BPL.equals(that.BPL));
    equal = equal && (this.total == null ? that.total == null : this.total.equals(that.total));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof state80percent)) {
      return false;
    }
    state80percent that = (state80percent) o;
    boolean equal = true;
    equal = equal && (this.State == null ? that.State == null : this.State.equals(that.State));
    equal = equal && (this.district == null ? that.district == null : this.district.equals(that.district));
    equal = equal && (this.BPL == null ? that.BPL == null : this.BPL.equals(that.BPL));
    equal = equal && (this.total == null ? that.total == null : this.total.equals(that.total));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.State = JdbcWritableBridge.readString(1, __dbResults);
    this.district = JdbcWritableBridge.readString(2, __dbResults);
    this.BPL = JdbcWritableBridge.readInteger(3, __dbResults);
    this.total = JdbcWritableBridge.readInteger(4, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.State = JdbcWritableBridge.readString(1, __dbResults);
    this.district = JdbcWritableBridge.readString(2, __dbResults);
    this.BPL = JdbcWritableBridge.readInteger(3, __dbResults);
    this.total = JdbcWritableBridge.readInteger(4, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(State, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(district, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(BPL, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(total, 4 + __off, 4, __dbStmt);
    return 4;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(State, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(district, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(BPL, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(total, 4 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.State = null;
    } else {
    this.State = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.district = null;
    } else {
    this.district = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BPL = null;
    } else {
    this.BPL = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.total = null;
    } else {
    this.total = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.State) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, State);
    }
    if (null == this.district) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, district);
    }
    if (null == this.BPL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.BPL);
    }
    if (null == this.total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.total);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.State) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, State);
    }
    if (null == this.district) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, district);
    }
    if (null == this.BPL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.BPL);
    }
    if (null == this.total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.total);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(State==null?"null":State, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(district==null?"null":district, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BPL==null?"null":"" + BPL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total==null?"null":"" + total, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(State==null?"null":State, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(district==null?"null":district, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BPL==null?"null":"" + BPL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total==null?"null":"" + total, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.State = null; } else {
      this.State = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.district = null; } else {
      this.district = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BPL = null; } else {
      this.BPL = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.total = null; } else {
      this.total = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.State = null; } else {
      this.State = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.district = null; } else {
      this.district = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BPL = null; } else {
      this.BPL = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.total = null; } else {
      this.total = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    state80percent o = (state80percent) super.clone();
    return o;
  }

  public void clone0(state80percent o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("State", this.State);
    __sqoop$field_map.put("district", this.district);
    __sqoop$field_map.put("BPL", this.BPL);
    __sqoop$field_map.put("total", this.total);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("State", this.State);
    __sqoop$field_map.put("district", this.district);
    __sqoop$field_map.put("BPL", this.BPL);
    __sqoop$field_map.put("total", this.total);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
