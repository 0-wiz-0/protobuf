//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google/protobuf/map_lite_unittest.proto

package protobuf_unittest;

@kotlin.jvm.JvmSynthetic
inline fun testRequiredMessageMapLite(block: protobuf_unittest.TestRequiredMessageMapLiteKt.Dsl.() -> Unit): protobuf_unittest.MapLiteUnittest.TestRequiredMessageMapLite =
  protobuf_unittest.TestRequiredMessageMapLiteKt.Dsl._create(protobuf_unittest.MapLiteUnittest.TestRequiredMessageMapLite.newBuilder()).apply { block() }._build()
object TestRequiredMessageMapLiteKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: protobuf_unittest.MapLiteUnittest.TestRequiredMessageMapLite.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: protobuf_unittest.MapLiteUnittest.TestRequiredMessageMapLite.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): protobuf_unittest.MapLiteUnittest.TestRequiredMessageMapLite = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class MapFieldProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>map&lt;int32, .protobuf_unittest.TestRequiredLite&gt; map_field = 1;</code>
     */
     val mapField: com.google.protobuf.kotlin.DslMap<kotlin.Int, protobuf_unittest.MapLiteUnittest.TestRequiredLite, MapFieldProxy>
      @kotlin.jvm.JvmSynthetic
      @JvmName("getMapFieldMap")
      get() = com.google.protobuf.kotlin.DslMap(
        _builder.getMapFieldMap()
      )
    /**
     * <code>map&lt;int32, .protobuf_unittest.TestRequiredLite&gt; map_field = 1;</code>
     */
    @JvmName("putMapField")
    fun com.google.protobuf.kotlin.DslMap<kotlin.Int, protobuf_unittest.MapLiteUnittest.TestRequiredLite, MapFieldProxy>
      .put(key: kotlin.Int, value: protobuf_unittest.MapLiteUnittest.TestRequiredLite) {
         _builder.putMapField(key, value)
       }
    /**
     * <code>map&lt;int32, .protobuf_unittest.TestRequiredLite&gt; map_field = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("setMapField")
    inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.Int, protobuf_unittest.MapLiteUnittest.TestRequiredLite, MapFieldProxy>
      .set(key: kotlin.Int, value: protobuf_unittest.MapLiteUnittest.TestRequiredLite) {
         put(key, value)
       }
    /**
     * <code>map&lt;int32, .protobuf_unittest.TestRequiredLite&gt; map_field = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("removeMapField")
    fun com.google.protobuf.kotlin.DslMap<kotlin.Int, protobuf_unittest.MapLiteUnittest.TestRequiredLite, MapFieldProxy>
      .remove(key: kotlin.Int) {
         _builder.removeMapField(key)
       }
    /**
     * <code>map&lt;int32, .protobuf_unittest.TestRequiredLite&gt; map_field = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("putAllMapField")
    fun com.google.protobuf.kotlin.DslMap<kotlin.Int, protobuf_unittest.MapLiteUnittest.TestRequiredLite, MapFieldProxy>
      .putAll(map: kotlin.collections.Map<kotlin.Int, protobuf_unittest.MapLiteUnittest.TestRequiredLite>) {
         _builder.putAllMapField(map)
       }
    /**
     * <code>map&lt;int32, .protobuf_unittest.TestRequiredLite&gt; map_field = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("clearMapField")
    fun com.google.protobuf.kotlin.DslMap<kotlin.Int, protobuf_unittest.MapLiteUnittest.TestRequiredLite, MapFieldProxy>
      .clear() {
         _builder.clearMapField()
       }
  }
}
inline fun protobuf_unittest.MapLiteUnittest.TestRequiredMessageMapLite.copy(block: protobuf_unittest.TestRequiredMessageMapLiteKt.Dsl.() -> Unit): protobuf_unittest.MapLiteUnittest.TestRequiredMessageMapLite =
  protobuf_unittest.TestRequiredMessageMapLiteKt.Dsl._create(this.toBuilder()).apply { block() }._build()
