// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: jid.proto

package easemob.pb;

public final class Jid {
  private Jid() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface JIDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:easemob.pb.JID)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string app_key = 1;</code>
     */
    boolean hasAppKey();
    /**
     * <code>optional string app_key = 1;</code>
     */
    java.lang.String getAppKey();
    /**
     * <code>optional string app_key = 1;</code>
     */
    com.google.protobuf.ByteString
        getAppKeyBytes();

    /**
     * <code>optional string name = 2;</code>
     */
    boolean hasName();
    /**
     * <code>optional string name = 2;</code>
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 2;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>optional string domain = 3;</code>
     */
    boolean hasDomain();
    /**
     * <code>optional string domain = 3;</code>
     */
    java.lang.String getDomain();
    /**
     * <code>optional string domain = 3;</code>
     */
    com.google.protobuf.ByteString
        getDomainBytes();

    /**
     * <code>optional string client_resource = 4;</code>
     */
    boolean hasClientResource();
    /**
     * <code>optional string client_resource = 4;</code>
     */
    java.lang.String getClientResource();
    /**
     * <code>optional string client_resource = 4;</code>
     */
    com.google.protobuf.ByteString
        getClientResourceBytes();
  }
  /**
   * Protobuf type {@code easemob.pb.JID}
   */
  public  static final class JID extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:easemob.pb.JID)
      JIDOrBuilder {
    // Use JID.newBuilder() to construct.
    private JID(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private JID() {
      appKey_ = "";
      name_ = "";
      domain_ = "";
      clientResource_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private JID(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
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
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              appKey_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              name_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              domain_ = bs;
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              clientResource_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return easemob.pb.Jid.internal_static_easemob_pb_JID_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return easemob.pb.Jid.internal_static_easemob_pb_JID_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              easemob.pb.Jid.JID.class, easemob.pb.Jid.JID.Builder.class);
    }

    private int bitField0_;
    public static final int APP_KEY_FIELD_NUMBER = 1;
    private volatile java.lang.Object appKey_;
    /**
     * <code>optional string app_key = 1;</code>
     */
    public boolean hasAppKey() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string app_key = 1;</code>
     */
    public java.lang.String getAppKey() {
      java.lang.Object ref = appKey_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          appKey_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string app_key = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAppKeyBytes() {
      java.lang.Object ref = appKey_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object name_;
    /**
     * <code>optional string name = 2;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DOMAIN_FIELD_NUMBER = 3;
    private volatile java.lang.Object domain_;
    /**
     * <code>optional string domain = 3;</code>
     */
    public boolean hasDomain() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string domain = 3;</code>
     */
    public java.lang.String getDomain() {
      java.lang.Object ref = domain_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          domain_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string domain = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDomainBytes() {
      java.lang.Object ref = domain_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        domain_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CLIENT_RESOURCE_FIELD_NUMBER = 4;
    private volatile java.lang.Object clientResource_;
    /**
     * <code>optional string client_resource = 4;</code>
     */
    public boolean hasClientResource() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string client_resource = 4;</code>
     */
    public java.lang.String getClientResource() {
      java.lang.Object ref = clientResource_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          clientResource_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string client_resource = 4;</code>
     */
    public com.google.protobuf.ByteString
        getClientResourceBytes() {
      java.lang.Object ref = clientResource_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientResource_ = b;
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, appKey_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, name_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 3, domain_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 4, clientResource_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, appKey_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, name_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(3, domain_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(4, clientResource_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static easemob.pb.Jid.JID parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static easemob.pb.Jid.JID parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static easemob.pb.Jid.JID parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static easemob.pb.Jid.JID parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static easemob.pb.Jid.JID parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static easemob.pb.Jid.JID parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static easemob.pb.Jid.JID parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static easemob.pb.Jid.JID parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static easemob.pb.Jid.JID parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static easemob.pb.Jid.JID parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(easemob.pb.Jid.JID prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code easemob.pb.JID}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:easemob.pb.JID)
        easemob.pb.Jid.JIDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return easemob.pb.Jid.internal_static_easemob_pb_JID_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return easemob.pb.Jid.internal_static_easemob_pb_JID_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                easemob.pb.Jid.JID.class, easemob.pb.Jid.JID.Builder.class);
      }

      // Construct using easemob.pb.Jid.JID.newBuilder()
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
      public Builder clear() {
        super.clear();
        appKey_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        domain_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        clientResource_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return easemob.pb.Jid.internal_static_easemob_pb_JID_descriptor;
      }

      public easemob.pb.Jid.JID getDefaultInstanceForType() {
        return easemob.pb.Jid.JID.getDefaultInstance();
      }

      public easemob.pb.Jid.JID build() {
        easemob.pb.Jid.JID result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public easemob.pb.Jid.JID buildPartial() {
        easemob.pb.Jid.JID result = new easemob.pb.Jid.JID(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.appKey_ = appKey_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.domain_ = domain_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.clientResource_ = clientResource_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof easemob.pb.Jid.JID) {
          return mergeFrom((easemob.pb.Jid.JID)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(easemob.pb.Jid.JID other) {
        if (other == easemob.pb.Jid.JID.getDefaultInstance()) return this;
        if (other.hasAppKey()) {
          bitField0_ |= 0x00000001;
          appKey_ = other.appKey_;
          onChanged();
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000002;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasDomain()) {
          bitField0_ |= 0x00000004;
          domain_ = other.domain_;
          onChanged();
        }
        if (other.hasClientResource()) {
          bitField0_ |= 0x00000008;
          clientResource_ = other.clientResource_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
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
        easemob.pb.Jid.JID parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (easemob.pb.Jid.JID) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object appKey_ = "";
      /**
       * <code>optional string app_key = 1;</code>
       */
      public boolean hasAppKey() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string app_key = 1;</code>
       */
      public java.lang.String getAppKey() {
        java.lang.Object ref = appKey_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            appKey_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string app_key = 1;</code>
       */
      public com.google.protobuf.ByteString
          getAppKeyBytes() {
        java.lang.Object ref = appKey_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          appKey_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string app_key = 1;</code>
       */
      public Builder setAppKey(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        appKey_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string app_key = 1;</code>
       */
      public Builder clearAppKey() {
        bitField0_ = (bitField0_ & ~0x00000001);
        appKey_ = getDefaultInstance().getAppKey();
        onChanged();
        return this;
      }
      /**
       * <code>optional string app_key = 1;</code>
       */
      public Builder setAppKeyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        appKey_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 2;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 2;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object domain_ = "";
      /**
       * <code>optional string domain = 3;</code>
       */
      public boolean hasDomain() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string domain = 3;</code>
       */
      public java.lang.String getDomain() {
        java.lang.Object ref = domain_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            domain_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string domain = 3;</code>
       */
      public com.google.protobuf.ByteString
          getDomainBytes() {
        java.lang.Object ref = domain_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          domain_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string domain = 3;</code>
       */
      public Builder setDomain(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        domain_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string domain = 3;</code>
       */
      public Builder clearDomain() {
        bitField0_ = (bitField0_ & ~0x00000004);
        domain_ = getDefaultInstance().getDomain();
        onChanged();
        return this;
      }
      /**
       * <code>optional string domain = 3;</code>
       */
      public Builder setDomainBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        domain_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object clientResource_ = "";
      /**
       * <code>optional string client_resource = 4;</code>
       */
      public boolean hasClientResource() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string client_resource = 4;</code>
       */
      public java.lang.String getClientResource() {
        java.lang.Object ref = clientResource_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            clientResource_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string client_resource = 4;</code>
       */
      public com.google.protobuf.ByteString
          getClientResourceBytes() {
        java.lang.Object ref = clientResource_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clientResource_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string client_resource = 4;</code>
       */
      public Builder setClientResource(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        clientResource_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string client_resource = 4;</code>
       */
      public Builder clearClientResource() {
        bitField0_ = (bitField0_ & ~0x00000008);
        clientResource_ = getDefaultInstance().getClientResource();
        onChanged();
        return this;
      }
      /**
       * <code>optional string client_resource = 4;</code>
       */
      public Builder setClientResourceBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        clientResource_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:easemob.pb.JID)
    }

    // @@protoc_insertion_point(class_scope:easemob.pb.JID)
    private static final easemob.pb.Jid.JID DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new easemob.pb.Jid.JID();
    }

    public static easemob.pb.Jid.JID getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<JID>
        PARSER = new com.google.protobuf.AbstractParser<JID>() {
      public JID parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new JID(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    public static com.google.protobuf.Parser<JID> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JID> getParserForType() {
      return PARSER;
    }

    public easemob.pb.Jid.JID getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_easemob_pb_JID_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_easemob_pb_JID_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tjid.proto\022\neasemob.pb\"M\n\003JID\022\017\n\007app_ke" +
      "y\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\016\n\006domain\030\003 \001(\t\022\027\n" +
      "\017client_resource\030\004 \001(\t"
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
    internal_static_easemob_pb_JID_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_easemob_pb_JID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_easemob_pb_JID_descriptor,
        new java.lang.String[] { "AppKey", "Name", "Domain", "ClientResource", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}