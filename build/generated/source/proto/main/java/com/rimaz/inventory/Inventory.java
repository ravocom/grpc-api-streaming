// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inventory/inventory.proto

package com.rimaz.inventory;

public final class Inventory {
  private Inventory() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_inventory_InventoryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_inventory_InventoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_inventory_InventoryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_inventory_InventoryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031inventory/inventory.proto\022\tinventory\"%" +
      "\n\020InventoryRequest\022\021\n\tflight_id\030\001 \001(\005\"7\n" +
      "\021InventoryResponse\022\022\n\nallocation\030\001 \001(\005\022\016" +
      "\n\006result\030\002 \001(\t2\221\002\n\020InventoryService\022M\n\016I" +
      "nventoryUnary\022\033.inventory.InventoryReque" +
      "st\032\034.inventory.InventoryResponse\"\000\022V\n\025In" +
      "ventoryClientStream\022\033.inventory.Inventor" +
      "yRequest\032\034.inventory.InventoryResponse\"\000" +
      "(\001\022V\n\025InventoryServerStream\022\033.inventory." +
      "InventoryRequest\032\034.inventory.InventoryRe" +
      "sponse\"\0000\001B\027\n\023com.rimaz.inventoryP\001b\006pro" +
      "to3"
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
    internal_static_inventory_InventoryRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_inventory_InventoryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_inventory_InventoryRequest_descriptor,
        new java.lang.String[] { "FlightId", });
    internal_static_inventory_InventoryResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_inventory_InventoryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_inventory_InventoryResponse_descriptor,
        new java.lang.String[] { "Allocation", "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}