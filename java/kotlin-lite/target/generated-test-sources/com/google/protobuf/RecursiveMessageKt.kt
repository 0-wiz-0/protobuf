//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google/protobuf/unittest_lite.proto

package com.google.protobuf;

@kotlin.jvm.JvmSynthetic
inline fun recursiveMessage(block: com.google.protobuf.RecursiveMessageKt.Dsl.() -> Unit): com.google.protobuf.UnittestLite.RecursiveMessage =
  com.google.protobuf.RecursiveMessageKt.Dsl._create(com.google.protobuf.UnittestLite.RecursiveMessage.newBuilder()).apply { block() }._build()
object RecursiveMessageKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: com.google.protobuf.UnittestLite.RecursiveMessage.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.google.protobuf.UnittestLite.RecursiveMessage.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.google.protobuf.UnittestLite.RecursiveMessage = _builder.build()

    /**
     * <code>optional .protobuf_unittest.RecursiveMessage recurse = 1;</code>
     */
    var recurse: com.google.protobuf.UnittestLite.RecursiveMessage
      @JvmName("getRecurse")
      get() = _builder.getRecurse()
      @JvmName("setRecurse")
      set(value) {
        _builder.setRecurse(value)
      }
    /**
     * <code>optional .protobuf_unittest.RecursiveMessage recurse = 1;</code>
     */
    fun clearRecurse() {
      _builder.clearRecurse()
    }
    /**
     * <code>optional .protobuf_unittest.RecursiveMessage recurse = 1;</code>
     * @return Whether the recurse field is set.
     */
    fun hasRecurse(): kotlin.Boolean {
      return _builder.hasRecurse()
    }

    /**
     * <code>optional bytes payload = 2;</code>
     */
    var payload: com.google.protobuf.ByteString
      @JvmName("getPayload")
      get() = _builder.getPayload()
      @JvmName("setPayload")
      set(value) {
        _builder.setPayload(value)
      }
    /**
     * <code>optional bytes payload = 2;</code>
     */
    fun clearPayload() {
      _builder.clearPayload()
    }
    /**
     * <code>optional bytes payload = 2;</code>
     * @return Whether the payload field is set.
     */
    fun hasPayload(): kotlin.Boolean {
      return _builder.hasPayload()
    }
  }
}
inline fun com.google.protobuf.UnittestLite.RecursiveMessage.copy(block: com.google.protobuf.RecursiveMessageKt.Dsl.() -> Unit): com.google.protobuf.UnittestLite.RecursiveMessage =
  com.google.protobuf.RecursiveMessageKt.Dsl._create(this.toBuilder()).apply { block() }._build()
