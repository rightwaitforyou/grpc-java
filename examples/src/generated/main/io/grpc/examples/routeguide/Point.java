// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide.proto

package io.grpc.examples.routeguide;

/**
 * Protobuf type {@code routeguide.Point}
 *
 * <pre>
 * Points are represented as latitude-longitude pairs in the E7 representation
 * (degrees multiplied by 10**7 and rounded to the nearest integer).
 * Latitudes should be in the range +/- 90 degrees and longitude should be in
 * the range +/- 180 degrees (inclusive).
 * </pre>
 */
public  final class Point extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:routeguide.Point)
    PointOrBuilder {
  // Use Point.newBuilder() to construct.
  private Point(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private Point() {
    latitude_ = 0;
    longitude_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Point(
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
          case 8: {

            latitude_ = input.readInt32();
            break;
          }
          case 16: {

            longitude_ = input.readInt32();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.examples.routeguide.RouteGuideProto.internal_static_routeguide_Point_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.examples.routeguide.RouteGuideProto.internal_static_routeguide_Point_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.examples.routeguide.Point.class, io.grpc.examples.routeguide.Point.Builder.class);
  }

  public static final com.google.protobuf.Parser<Point> PARSER =
      new com.google.protobuf.AbstractParser<Point>() {
    public Point parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Point(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<Point> getParserForType() {
    return PARSER;
  }

  public static final int LATITUDE_FIELD_NUMBER = 1;
  private int latitude_;
  /**
   * <code>optional int32 latitude = 1;</code>
   */
  public int getLatitude() {
    return latitude_;
  }

  public static final int LONGITUDE_FIELD_NUMBER = 2;
  private int longitude_;
  /**
   * <code>optional int32 longitude = 2;</code>
   */
  public int getLongitude() {
    return longitude_;
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
    getSerializedSize();
    if (latitude_ != 0) {
      output.writeInt32(1, latitude_);
    }
    if (longitude_ != 0) {
      output.writeInt32(2, longitude_);
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (latitude_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, latitude_);
    }
    if (longitude_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, longitude_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.grpc.examples.routeguide.Point parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.routeguide.Point parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.routeguide.Point parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.routeguide.Point parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.routeguide.Point parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.examples.routeguide.Point parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.grpc.examples.routeguide.Point parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.grpc.examples.routeguide.Point parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.grpc.examples.routeguide.Point parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.examples.routeguide.Point parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return new Builder(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(io.grpc.examples.routeguide.Point prototype) {
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
   * Protobuf type {@code routeguide.Point}
   *
   * <pre>
   * Points are represented as latitude-longitude pairs in the E7 representation
   * (degrees multiplied by 10**7 and rounded to the nearest integer).
   * Latitudes should be in the range +/- 90 degrees and longitude should be in
   * the range +/- 180 degrees (inclusive).
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:routeguide.Point)
      io.grpc.examples.routeguide.PointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.examples.routeguide.RouteGuideProto.internal_static_routeguide_Point_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.examples.routeguide.RouteGuideProto.internal_static_routeguide_Point_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.examples.routeguide.Point.class, io.grpc.examples.routeguide.Point.Builder.class);
    }

    // Construct using io.grpc.examples.routeguide.Point.newBuilder()
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
      latitude_ = 0;

      longitude_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.examples.routeguide.RouteGuideProto.internal_static_routeguide_Point_descriptor;
    }

    public io.grpc.examples.routeguide.Point getDefaultInstanceForType() {
      return io.grpc.examples.routeguide.Point.getDefaultInstance();
    }

    public io.grpc.examples.routeguide.Point build() {
      io.grpc.examples.routeguide.Point result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.examples.routeguide.Point buildPartial() {
      io.grpc.examples.routeguide.Point result = new io.grpc.examples.routeguide.Point(this);
      result.latitude_ = latitude_;
      result.longitude_ = longitude_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.examples.routeguide.Point) {
        return mergeFrom((io.grpc.examples.routeguide.Point)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.examples.routeguide.Point other) {
      if (other == io.grpc.examples.routeguide.Point.getDefaultInstance()) return this;
      if (other.getLatitude() != 0) {
        setLatitude(other.getLatitude());
      }
      if (other.getLongitude() != 0) {
        setLongitude(other.getLongitude());
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
      io.grpc.examples.routeguide.Point parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.examples.routeguide.Point) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int latitude_ ;
    /**
     * <code>optional int32 latitude = 1;</code>
     */
    public int getLatitude() {
      return latitude_;
    }
    /**
     * <code>optional int32 latitude = 1;</code>
     */
    public Builder setLatitude(int value) {
      
      latitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 latitude = 1;</code>
     */
    public Builder clearLatitude() {
      
      latitude_ = 0;
      onChanged();
      return this;
    }

    private int longitude_ ;
    /**
     * <code>optional int32 longitude = 2;</code>
     */
    public int getLongitude() {
      return longitude_;
    }
    /**
     * <code>optional int32 longitude = 2;</code>
     */
    public Builder setLongitude(int value) {
      
      longitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 longitude = 2;</code>
     */
    public Builder clearLongitude() {
      
      longitude_ = 0;
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


    // @@protoc_insertion_point(builder_scope:routeguide.Point)
  }

  // @@protoc_insertion_point(class_scope:routeguide.Point)
  private static final io.grpc.examples.routeguide.Point defaultInstance;static {
    defaultInstance = new io.grpc.examples.routeguide.Point();
  }

  public static io.grpc.examples.routeguide.Point getDefaultInstance() {
    return defaultInstance;
  }

  public io.grpc.examples.routeguide.Point getDefaultInstanceForType() {
    return defaultInstance;
  }

}
