//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google/protobuf/unittest_lite.proto

package com.google.protobuf;

@kotlin.jvm.JvmSynthetic
inline fun dupEnum(block: com.google.protobuf.DupEnumKt.Dsl.() -> Unit): com.google.protobuf.UnittestLite.DupEnum =
  com.google.protobuf.DupEnumKt.Dsl._create(com.google.protobuf.UnittestLite.DupEnum.newBuilder()).apply { block() }._build()
object DupEnumKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: com.google.protobuf.UnittestLite.DupEnum.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.google.protobuf.UnittestLite.DupEnum.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.google.protobuf.UnittestLite.DupEnum = _builder.build()
  }
}
inline fun com.google.protobuf.UnittestLite.DupEnum.copy(block: com.google.protobuf.DupEnumKt.Dsl.() -> Unit): com.google.protobuf.UnittestLite.DupEnum =
  com.google.protobuf.DupEnumKt.Dsl._create(this.toBuilder()).apply { block() }._build()
