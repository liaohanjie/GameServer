// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/user.proto

package info.xiaomo.server.message;

public final class UserProto {
  private UserProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReqLoginMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReqLoginMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 sex = 2;</code>
     */
    int getSex();

    /**
     * <code>string loginName = 3;</code>
     */
    String getLoginName();
    /**
     * <code>string loginName = 3;</code>
     */
    com.google.protobuf.ByteString
        getLoginNameBytes();
  }
  /**
   * Protobuf type {@code ReqLoginMessage}
   */
  public  static final class ReqLoginMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReqLoginMessage)
      ReqLoginMessageOrBuilder {
    // Use ReqLoginMessage.newBuilder() to construct.
    private ReqLoginMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReqLoginMessage() {
      sex_ = 0;
      loginName_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ReqLoginMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 16: {

              sex_ = input.readInt32();
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              loginName_ = s;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return UserProto.internal_static_ReqLoginMessage_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return UserProto.internal_static_ReqLoginMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ReqLoginMessage.class, Builder.class);
    }

    public static final int SEX_FIELD_NUMBER = 2;
    private int sex_;
    /**
     * <code>int32 sex = 2;</code>
     */
    public int getSex() {
      return sex_;
    }

    public static final int LOGINNAME_FIELD_NUMBER = 3;
    private volatile Object loginName_;
    /**
     * <code>string loginName = 3;</code>
     */
    public String getLoginName() {
      Object ref = loginName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        loginName_ = s;
        return s;
      }
    }
    /**
     * <code>string loginName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getLoginNameBytes() {
      Object ref = loginName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        loginName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (sex_ != 0) {
        output.writeInt32(2, sex_);
      }
      if (!getLoginNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, loginName_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, sex_);
      }
      if (!getLoginNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, loginName_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ReqLoginMessage)) {
        return super.equals(obj);
      }
      ReqLoginMessage other = (ReqLoginMessage) obj;

      boolean result = true;
      result = result && (getSex()
          == other.getSex());
      result = result && getLoginName()
          .equals(other.getLoginName());
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SEX_FIELD_NUMBER;
      hash = (53 * hash) + getSex();
      hash = (37 * hash) + LOGINNAME_FIELD_NUMBER;
      hash = (53 * hash) + getLoginName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ReqLoginMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ReqLoginMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ReqLoginMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ReqLoginMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ReqLoginMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ReqLoginMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ReqLoginMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ReqLoginMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ReqLoginMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ReqLoginMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ReqLoginMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ReqLoginMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ReqLoginMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ReqLoginMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReqLoginMessage)
        ReqLoginMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return UserProto.internal_static_ReqLoginMessage_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return UserProto.internal_static_ReqLoginMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ReqLoginMessage.class, Builder.class);
      }

      // Construct using info.xiaomo.server.message.UserProto.ReqLoginMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        sex_ = 0;

        loginName_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return UserProto.internal_static_ReqLoginMessage_descriptor;
      }

      public ReqLoginMessage getDefaultInstanceForType() {
        return ReqLoginMessage.getDefaultInstance();
      }

      public ReqLoginMessage build() {
        ReqLoginMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ReqLoginMessage buildPartial() {
        ReqLoginMessage result = new ReqLoginMessage(this);
        result.sex_ = sex_;
        result.loginName_ = loginName_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ReqLoginMessage) {
          return mergeFrom((ReqLoginMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ReqLoginMessage other) {
        if (other == ReqLoginMessage.getDefaultInstance()) return this;
        if (other.getSex() != 0) {
          setSex(other.getSex());
        }
        if (!other.getLoginName().isEmpty()) {
          loginName_ = other.loginName_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ReqLoginMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ReqLoginMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int sex_ ;
      /**
       * <code>int32 sex = 2;</code>
       */
      public int getSex() {
        return sex_;
      }
      /**
       * <code>int32 sex = 2;</code>
       */
      public Builder setSex(int value) {
        
        sex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 sex = 2;</code>
       */
      public Builder clearSex() {
        
        sex_ = 0;
        onChanged();
        return this;
      }

      private Object loginName_ = "";
      /**
       * <code>string loginName = 3;</code>
       */
      public String getLoginName() {
        Object ref = loginName_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          loginName_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string loginName = 3;</code>
       */
      public com.google.protobuf.ByteString
          getLoginNameBytes() {
        Object ref = loginName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          loginName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string loginName = 3;</code>
       */
      public Builder setLoginName(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        loginName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string loginName = 3;</code>
       */
      public Builder clearLoginName() {
        
        loginName_ = getDefaultInstance().getLoginName();
        onChanged();
        return this;
      }
      /**
       * <code>string loginName = 3;</code>
       */
      public Builder setLoginNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        loginName_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:ReqLoginMessage)
    }

    // @@protoc_insertion_point(class_scope:ReqLoginMessage)
    private static final ReqLoginMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ReqLoginMessage();
    }

    public static ReqLoginMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReqLoginMessage>
        PARSER = new com.google.protobuf.AbstractParser<ReqLoginMessage>() {
      public ReqLoginMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ReqLoginMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReqLoginMessage> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ReqLoginMessage> getParserForType() {
      return PARSER;
    }

    public ReqLoginMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ResLoginMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResLoginMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 sex = 2;</code>
     */
    int getSex();

    /**
     * <code>string loginName = 3;</code>
     */
    String getLoginName();
    /**
     * <code>string loginName = 3;</code>
     */
    com.google.protobuf.ByteString
        getLoginNameBytes();
  }
  /**
   * Protobuf type {@code ResLoginMessage}
   */
  public  static final class ResLoginMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ResLoginMessage)
      ResLoginMessageOrBuilder {
    // Use ResLoginMessage.newBuilder() to construct.
    private ResLoginMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResLoginMessage() {
      sex_ = 0;
      loginName_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ResLoginMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 16: {

              sex_ = input.readInt32();
              break;
            }
            case 26: {
              String s = input.readStringRequireUtf8();

              loginName_ = s;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return UserProto.internal_static_ResLoginMessage_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return UserProto.internal_static_ResLoginMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ResLoginMessage.class, Builder.class);
    }

    public static final int SEX_FIELD_NUMBER = 2;
    private int sex_;
    /**
     * <code>int32 sex = 2;</code>
     */
    public int getSex() {
      return sex_;
    }

    public static final int LOGINNAME_FIELD_NUMBER = 3;
    private volatile Object loginName_;
    /**
     * <code>string loginName = 3;</code>
     */
    public String getLoginName() {
      Object ref = loginName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        loginName_ = s;
        return s;
      }
    }
    /**
     * <code>string loginName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getLoginNameBytes() {
      Object ref = loginName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        loginName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (sex_ != 0) {
        output.writeInt32(2, sex_);
      }
      if (!getLoginNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, loginName_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, sex_);
      }
      if (!getLoginNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, loginName_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ResLoginMessage)) {
        return super.equals(obj);
      }
      ResLoginMessage other = (ResLoginMessage) obj;

      boolean result = true;
      result = result && (getSex()
          == other.getSex());
      result = result && getLoginName()
          .equals(other.getLoginName());
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SEX_FIELD_NUMBER;
      hash = (53 * hash) + getSex();
      hash = (37 * hash) + LOGINNAME_FIELD_NUMBER;
      hash = (53 * hash) + getLoginName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ResLoginMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResLoginMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResLoginMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResLoginMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResLoginMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ResLoginMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ResLoginMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResLoginMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResLoginMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ResLoginMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ResLoginMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ResLoginMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ResLoginMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ResLoginMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResLoginMessage)
        ResLoginMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return UserProto.internal_static_ResLoginMessage_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return UserProto.internal_static_ResLoginMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ResLoginMessage.class, Builder.class);
      }

      // Construct using info.xiaomo.server.message.UserProto.ResLoginMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        sex_ = 0;

        loginName_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return UserProto.internal_static_ResLoginMessage_descriptor;
      }

      public ResLoginMessage getDefaultInstanceForType() {
        return ResLoginMessage.getDefaultInstance();
      }

      public ResLoginMessage build() {
        ResLoginMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ResLoginMessage buildPartial() {
        ResLoginMessage result = new ResLoginMessage(this);
        result.sex_ = sex_;
        result.loginName_ = loginName_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ResLoginMessage) {
          return mergeFrom((ResLoginMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ResLoginMessage other) {
        if (other == ResLoginMessage.getDefaultInstance()) return this;
        if (other.getSex() != 0) {
          setSex(other.getSex());
        }
        if (!other.getLoginName().isEmpty()) {
          loginName_ = other.loginName_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ResLoginMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ResLoginMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int sex_ ;
      /**
       * <code>int32 sex = 2;</code>
       */
      public int getSex() {
        return sex_;
      }
      /**
       * <code>int32 sex = 2;</code>
       */
      public Builder setSex(int value) {
        
        sex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 sex = 2;</code>
       */
      public Builder clearSex() {
        
        sex_ = 0;
        onChanged();
        return this;
      }

      private Object loginName_ = "";
      /**
       * <code>string loginName = 3;</code>
       */
      public String getLoginName() {
        Object ref = loginName_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          loginName_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string loginName = 3;</code>
       */
      public com.google.protobuf.ByteString
          getLoginNameBytes() {
        Object ref = loginName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          loginName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string loginName = 3;</code>
       */
      public Builder setLoginName(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        loginName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string loginName = 3;</code>
       */
      public Builder clearLoginName() {
        
        loginName_ = getDefaultInstance().getLoginName();
        onChanged();
        return this;
      }
      /**
       * <code>string loginName = 3;</code>
       */
      public Builder setLoginNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        loginName_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:ResLoginMessage)
    }

    // @@protoc_insertion_point(class_scope:ResLoginMessage)
    private static final ResLoginMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ResLoginMessage();
    }

    public static ResLoginMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResLoginMessage>
        PARSER = new com.google.protobuf.AbstractParser<ResLoginMessage>() {
      public ResLoginMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ResLoginMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ResLoginMessage> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ResLoginMessage> getParserForType() {
      return PARSER;
    }

    public ResLoginMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReqLoginMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReqLoginMessage_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResLoginMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResLoginMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\020proto/user.proto\"1\n\017ReqLoginMessage\022\013\n" +
      "\003sex\030\002 \001(\005\022\021\n\tloginName\030\003 \001(\t\"1\n\017ResLogi" +
      "nMessage\022\013\n\003sex\030\002 \001(\005\022\021\n\tloginName\030\003 \001(\t" +
      "B\'\n\032info.xiaomo.server.messageB\tUserProt" +
      "ob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_ReqLoginMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReqLoginMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReqLoginMessage_descriptor,
        new String[] { "Sex", "LoginName", });
    internal_static_ResLoginMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ResLoginMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResLoginMessage_descriptor,
        new String[] { "Sex", "LoginName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}