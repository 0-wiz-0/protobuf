//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google/protobuf/unittest_proto3.proto

package proto3_unittest;

@kotlin.jvm.JvmSynthetic
inline fun testEmptyMessage(block: proto3_unittest.TestEmptyMessageKt.Dsl.() -> Unit): proto3_unittest.UnittestProto3.TestEmptyMessage =
  proto3_unittest.TestEmptyMessageKt.Dsl._create(proto3_unittest.UnittestProto3.TestEmptyMessage.newBuilder()).apply { block() }._build()
object TestEmptyMessageKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: proto3_unittest.UnittestProto3.TestEmptyMessage.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: proto3_unittest.UnittestProto3.TestEmptyMessage.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): proto3_unittest.UnittestProto3.TestEmptyMessage = _builder.build()
  }
}
inline fun proto3_unittest.UnittestProto3.TestEmptyMessage.copy(block: proto3_unittest.TestEmptyMessageKt.Dsl.() -> Unit): proto3_unittest.UnittestProto3.TestEmptyMessage =
  proto3_unittest.TestEmptyMessageKt.Dsl._create(this.toBuilder()).apply { block() }._build()
