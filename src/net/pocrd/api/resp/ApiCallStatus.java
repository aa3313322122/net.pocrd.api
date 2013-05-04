// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: net/pocrd/api/resp/Api_CallStatus.proto

package net.pocrd.api.resp;

public final class ApiCallStatus {
  private ApiCallStatus() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface Api_CallStatusOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 code = 1;
    /**
     * <code>required int32 code = 1;</code>
     *
     * <pre>
     * 返回值
     * </pre>
     */
    boolean hasCode();
    /**
     * <code>required int32 code = 1;</code>
     *
     * <pre>
     * 返回值
     * </pre>
     */
    int getCode();

    // required string msg = 2;
    /**
     * <code>required string msg = 2;</code>
     *
     * <pre>
     * 返回信息
     * </pre>
     */
    boolean hasMsg();
    /**
     * <code>required string msg = 2;</code>
     *
     * <pre>
     * 返回信息
     * </pre>
     */
    java.lang.String getMsg();
    /**
     * <code>required string msg = 2;</code>
     *
     * <pre>
     * 返回信息
     * </pre>
     */
    com.google.protobuf.ByteString
        getMsgBytes();

    // required int32 start = 3;
    /**
     * <code>required int32 start = 3;</code>
     *
     * <pre>
     * 信息起始位置
     * </pre>
     */
    boolean hasStart();
    /**
     * <code>required int32 start = 3;</code>
     *
     * <pre>
     * 信息起始位置
     * </pre>
     */
    int getStart();

    // required int32 length = 4;
    /**
     * <code>required int32 length = 4;</code>
     *
     * <pre>
     * 信息长度
     * </pre>
     */
    boolean hasLength();
    /**
     * <code>required int32 length = 4;</code>
     *
     * <pre>
     * 信息长度
     * </pre>
     */
    int getLength();
  }
  /**
   * Protobuf type {@code net.pocrd.api.resp.Api_CallStatus}
   */
  public static final class Api_CallStatus extends
      com.google.protobuf.GeneratedMessage
      implements Api_CallStatusOrBuilder {
    // Use Api_CallStatus.newBuilder() to construct.
    private Api_CallStatus(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Api_CallStatus(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Api_CallStatus defaultInstance;
    public static Api_CallStatus getDefaultInstance() {
      return defaultInstance;
    }

    public Api_CallStatus getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Api_CallStatus(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              code_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              msg_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              start_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              length_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pocrd.api.resp.ApiCallStatus.internal_static_net_pocrd_api_resp_Api_CallStatus_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pocrd.api.resp.ApiCallStatus.internal_static_net_pocrd_api_resp_Api_CallStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.pocrd.api.resp.ApiCallStatus.Api_CallStatus.class, net.pocrd.api.resp.ApiCallStatus.Api_CallStatus.Builder.class);
    }

    public static com.google.protobuf.Parser<Api_CallStatus> PARSER =
        new com.google.protobuf.AbstractParser<Api_CallStatus>() {
      public Api_CallStatus parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Api_CallStatus(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Api_CallStatus> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 code = 1;
    public static final int CODE_FIELD_NUMBER = 1;
    private int code_;
    /**
     * <code>required int32 code = 1;</code>
     *
     * <pre>
     * 返回值
     * </pre>
     */
    public boolean hasCode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 code = 1;</code>
     *
     * <pre>
     * 返回值
     * </pre>
     */
    public int getCode() {
      return code_;
    }

    // required string msg = 2;
    public static final int MSG_FIELD_NUMBER = 2;
    private java.lang.Object msg_;
    /**
     * <code>required string msg = 2;</code>
     *
     * <pre>
     * 返回信息
     * </pre>
     */
    public boolean hasMsg() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string msg = 2;</code>
     *
     * <pre>
     * 返回信息
     * </pre>
     */
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          msg_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string msg = 2;</code>
     *
     * <pre>
     * 返回信息
     * </pre>
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required int32 start = 3;
    public static final int START_FIELD_NUMBER = 3;
    private int start_;
    /**
     * <code>required int32 start = 3;</code>
     *
     * <pre>
     * 信息起始位置
     * </pre>
     */
    public boolean hasStart() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 start = 3;</code>
     *
     * <pre>
     * 信息起始位置
     * </pre>
     */
    public int getStart() {
      return start_;
    }

    // required int32 length = 4;
    public static final int LENGTH_FIELD_NUMBER = 4;
    private int length_;
    /**
     * <code>required int32 length = 4;</code>
     *
     * <pre>
     * 信息长度
     * </pre>
     */
    public boolean hasLength() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int32 length = 4;</code>
     *
     * <pre>
     * 信息长度
     * </pre>
     */
    public int getLength() {
      return length_;
    }

    private void initFields() {
      code_ = 0;
      msg_ = "";
      start_ = 0;
      length_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMsg()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStart()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLength()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, code_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getMsgBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, start_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, length_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, code_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getMsgBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, start_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, length_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static net.pocrd.api.resp.ApiCallStatus.Api_CallStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.pocrd.api.resp.ApiCallStatus.Api_CallStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.pocrd.api.resp.ApiCallStatus.Api_CallStatus parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.pocrd.api.resp.ApiCallStatus.Api_CallStatus parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.pocrd.api.resp.ApiCallStatus.Api_CallStatus parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static net.pocrd.api.resp.ApiCallStatus.Api_CallStatus parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static net.pocrd.api.resp.ApiCallStatus.Api_CallStatus parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static net.pocrd.api.resp.ApiCallStatus.Api_CallStatus parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static net.pocrd.api.resp.ApiCallStatus.Api_CallStatus parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static net.pocrd.api.resp.ApiCallStatus.Api_CallStatus parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pocrd.api.resp.ApiCallStatus.Api_CallStatus prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code net.pocrd.api.resp.Api_CallStatus}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements net.pocrd.api.resp.ApiCallStatus.Api_CallStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pocrd.api.resp.ApiCallStatus.internal_static_net_pocrd_api_resp_Api_CallStatus_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pocrd.api.resp.ApiCallStatus.internal_static_net_pocrd_api_resp_Api_CallStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                net.pocrd.api.resp.ApiCallStatus.Api_CallStatus.class, net.pocrd.api.resp.ApiCallStatus.Api_CallStatus.Builder.class);
      }

      // Construct using net.pocrd.api.resp.ApiCallStatus.Api_CallStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        code_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        msg_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        start_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        length_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pocrd.api.resp.ApiCallStatus.internal_static_net_pocrd_api_resp_Api_CallStatus_descriptor;
      }

      public net.pocrd.api.resp.ApiCallStatus.Api_CallStatus getDefaultInstanceForType() {
        return net.pocrd.api.resp.ApiCallStatus.Api_CallStatus.getDefaultInstance();
      }

      public net.pocrd.api.resp.ApiCallStatus.Api_CallStatus build() {
        net.pocrd.api.resp.ApiCallStatus.Api_CallStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public net.pocrd.api.resp.ApiCallStatus.Api_CallStatus buildPartial() {
        net.pocrd.api.resp.ApiCallStatus.Api_CallStatus result = new net.pocrd.api.resp.ApiCallStatus.Api_CallStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.code_ = code_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.msg_ = msg_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.start_ = start_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.length_ = length_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pocrd.api.resp.ApiCallStatus.Api_CallStatus) {
          return mergeFrom((net.pocrd.api.resp.ApiCallStatus.Api_CallStatus)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(net.pocrd.api.resp.ApiCallStatus.Api_CallStatus other) {
        if (other == net.pocrd.api.resp.ApiCallStatus.Api_CallStatus.getDefaultInstance()) return this;
        if (other.hasCode()) {
          setCode(other.getCode());
        }
        if (other.hasMsg()) {
          bitField0_ |= 0x00000002;
          msg_ = other.msg_;
          onChanged();
        }
        if (other.hasStart()) {
          setStart(other.getStart());
        }
        if (other.hasLength()) {
          setLength(other.getLength());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasCode()) {
          
          return false;
        }
        if (!hasMsg()) {
          
          return false;
        }
        if (!hasStart()) {
          
          return false;
        }
        if (!hasLength()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        net.pocrd.api.resp.ApiCallStatus.Api_CallStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (net.pocrd.api.resp.ApiCallStatus.Api_CallStatus) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 code = 1;
      private int code_ ;
      /**
       * <code>required int32 code = 1;</code>
       *
       * <pre>
       * 返回值
       * </pre>
       */
      public boolean hasCode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 code = 1;</code>
       *
       * <pre>
       * 返回值
       * </pre>
       */
      public int getCode() {
        return code_;
      }
      /**
       * <code>required int32 code = 1;</code>
       *
       * <pre>
       * 返回值
       * </pre>
       */
      public Builder setCode(int value) {
        bitField0_ |= 0x00000001;
        code_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 code = 1;</code>
       *
       * <pre>
       * 返回值
       * </pre>
       */
      public Builder clearCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        code_ = 0;
        onChanged();
        return this;
      }

      // required string msg = 2;
      private java.lang.Object msg_ = "";
      /**
       * <code>required string msg = 2;</code>
       *
       * <pre>
       * 返回信息
       * </pre>
       */
      public boolean hasMsg() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string msg = 2;</code>
       *
       * <pre>
       * 返回信息
       * </pre>
       */
      public java.lang.String getMsg() {
        java.lang.Object ref = msg_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          msg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string msg = 2;</code>
       *
       * <pre>
       * 返回信息
       * </pre>
       */
      public com.google.protobuf.ByteString
          getMsgBytes() {
        java.lang.Object ref = msg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          msg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string msg = 2;</code>
       *
       * <pre>
       * 返回信息
       * </pre>
       */
      public Builder setMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        msg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string msg = 2;</code>
       *
       * <pre>
       * 返回信息
       * </pre>
       */
      public Builder clearMsg() {
        bitField0_ = (bitField0_ & ~0x00000002);
        msg_ = getDefaultInstance().getMsg();
        onChanged();
        return this;
      }
      /**
       * <code>required string msg = 2;</code>
       *
       * <pre>
       * 返回信息
       * </pre>
       */
      public Builder setMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        msg_ = value;
        onChanged();
        return this;
      }

      // required int32 start = 3;
      private int start_ ;
      /**
       * <code>required int32 start = 3;</code>
       *
       * <pre>
       * 信息起始位置
       * </pre>
       */
      public boolean hasStart() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 start = 3;</code>
       *
       * <pre>
       * 信息起始位置
       * </pre>
       */
      public int getStart() {
        return start_;
      }
      /**
       * <code>required int32 start = 3;</code>
       *
       * <pre>
       * 信息起始位置
       * </pre>
       */
      public Builder setStart(int value) {
        bitField0_ |= 0x00000004;
        start_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 start = 3;</code>
       *
       * <pre>
       * 信息起始位置
       * </pre>
       */
      public Builder clearStart() {
        bitField0_ = (bitField0_ & ~0x00000004);
        start_ = 0;
        onChanged();
        return this;
      }

      // required int32 length = 4;
      private int length_ ;
      /**
       * <code>required int32 length = 4;</code>
       *
       * <pre>
       * 信息长度
       * </pre>
       */
      public boolean hasLength() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required int32 length = 4;</code>
       *
       * <pre>
       * 信息长度
       * </pre>
       */
      public int getLength() {
        return length_;
      }
      /**
       * <code>required int32 length = 4;</code>
       *
       * <pre>
       * 信息长度
       * </pre>
       */
      public Builder setLength(int value) {
        bitField0_ |= 0x00000008;
        length_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 length = 4;</code>
       *
       * <pre>
       * 信息长度
       * </pre>
       */
      public Builder clearLength() {
        bitField0_ = (bitField0_ & ~0x00000008);
        length_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:net.pocrd.api.resp.Api_CallStatus)
    }

    static {
      defaultInstance = new Api_CallStatus(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:net.pocrd.api.resp.Api_CallStatus)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_pocrd_api_resp_Api_CallStatus_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_pocrd_api_resp_Api_CallStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'net/pocrd/api/resp/Api_CallStatus.prot" +
      "o\022\022net.pocrd.api.resp\"J\n\016Api_CallStatus\022" +
      "\014\n\004code\030\001 \002(\005\022\013\n\003msg\030\002 \002(\t\022\r\n\005start\030\003 \002(" +
      "\005\022\016\n\006length\030\004 \002(\005"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_net_pocrd_api_resp_Api_CallStatus_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_net_pocrd_api_resp_Api_CallStatus_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_pocrd_api_resp_Api_CallStatus_descriptor,
              new java.lang.String[] { "Code", "Msg", "Start", "Length", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
