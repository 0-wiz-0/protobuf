//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google/protobuf/map_lite_unittest.proto

package protobuf_unittest;

@kotlin.jvm.JvmSynthetic
inline fun testMessageMapLite(block: protobuf_unittest.TestMessageMapLiteKt.Dsl.() -> Unit): protobuf_unittest.MapLiteUnittest.TestMessageMapLite =
  protobuf_unittest.TestMessageMapLiteKt.Dsl._create(protobuf_unittest.MapLiteUnittest.TestMessageMapLite.newBuilder()).apply { block() }._build()
object TestMessageMapLiteKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: protobuf_unittest.MapLiteUnittest.TestMessageMapLite.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: protobuf_unittest.MapLiteUnittest.TestMessageMapLite.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): protobuf_unittest.MapLiteUnittest.TestMessageMapLite = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class MapInt32MessageProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>map&lt;int32, .protobuf_unittest.TestAllTypesLite&gt; map_int32_message = 1;</code>
     */
     val mapInt32Message: com.google.protobuf.kotlin.DslMap<kotlin.Int, com.google.protobuf.UnittestLite.TestAllTypesLite, MapInt32MessageProxy>
      @kotlin.jvm.JvmSynthetic
      @JvmName("getMapInt32MessageMap")
      get() = com.google.protobuf.kotlin.DslMap(
        _builder.getMapInt32MessageMap()
      )
    /**
     * <code>map&lt;int32, .protobuf_unittest.TestAllTypesLite&gt; map_int32_message = 1;</code>
     */
    @JvmName("putMapInt32Message")
    fun com.google.protobuf.kotlin.DslMap<kotlin.Int, com.google.protobuf.UnittestLite.TestAllTypesLite, MapInt32MessageProxy>
      .put(key: kotlin.Int, value: com.google.protobuf.UnittestLite.TestAllTypesLite) {
         _builder.putMapInt32Message(key, value)
       }
    /**
     * <code>map&lt;int32, .protobuf_unittest.TestAllTypesLite&gt; map_int32_message = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("setMapInt32Message")
    inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.Int, com.google.protobuf.UnittestLite.TestAllTypesLite, MapInt32MessageProxy>
      .set(key: kotlin.Int, value: com.google.protobuf.UnittestLite.TestAllTypesLite) {
         put(key, value)
       }
    /**
     * <code>map&lt;int32, .protobuf_unittest.TestAllTypesLite&gt; map_int32_message = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("removeMapInt32Message")
    fun com.google.protobuf.kotlin.DslMap<kotlin.Int, com.google.protobuf.UnittestLite.TestAllTypesLite, MapInt32MessageProxy>
      .remove(key: kotlin.Int) {
         _builder.removeMapInt32Message(key)
       }
    /**
     * <code>map&lt;int32, .protobuf_unittest.TestAllTypesLite&gt; map_int32_message = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("putAllMapInt32Message")
    fun com.google.protobuf.kotlin.DslMap<kotlin.Int, com.google.protobuf.UnittestLite.TestAllTypesLite, MapInt32MessageProxy>
      .putAll(map: kotlin.collections.Map<kotlin.Int, com.google.protobuf.UnittestLite.TestAllTypesLite>) {
         _builder.putAllMapInt32Message(map)
       }
    /**
     * <code>map&lt;int32, .protobuf_unittest.TestAllTypesLite&gt; map_int32_message = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("clearMapInt32Message")
    fun com.google.protobuf.kotlin.DslMap<kotlin.Int, com.google.protobuf.UnittestLite.TestAllTypesLite, MapInt32MessageProxy>
      .clear() {
         _builder.clearMapInt32Message()
       }
  }
}
inline fun protobuf_unittest.MapLiteUnittest.TestMessageMapLite.copy(block: protobuf_unittest.TestMessageMapLiteKt.Dsl.() -> Unit): protobuf_unittest.MapLiteUnittest.TestMessageMapLite =
  protobuf_unittest.TestMessageMapLiteKt.Dsl._create(this.toBuilder()).apply { block() }._build()
