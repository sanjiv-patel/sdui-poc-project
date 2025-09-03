# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [components/text/v1/text.proto](#components_text_v1_text-proto)
    - [SDUITextView](#components-text-v1-SDUITextView)
    - [TextStyle](#components-text-v1-TextStyle)
  
    - [AndroidTypography](#components-text-v1-AndroidTypography)
    - [IOSTypography](#components-text-v1-IOSTypography)
    - [TextOverFlow](#components-text-v1-TextOverFlow)
  
- [Scalar Value Types](#scalar-value-types)



<a name="components_text_v1_text-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## components/text/v1/text.proto



<a name="components-text-v1-SDUITextView"></a>

### SDUITextView



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| text | [string](#string) |  |  |
| enabled | [bool](#bool) |  |  |
| action | [components.properties.v1.Action](#components-properties-v1-Action) |  |  |
| style | [TextStyle](#components-text-v1-TextStyle) |  |  |






<a name="components-text-v1-TextStyle"></a>

### TextStyle



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| fullWidth | [bool](#bool) |  |  |
| backgroundColor | [string](#string) |  |  |
| txtColor | [string](#string) |  |  |
| textAlignment | [components.properties.v1.TextAlignment](#components-properties-v1-TextAlignment) |  |  |
| max_lines | [int32](#int32) |  |  |
| max_lenght | [int32](#int32) |  |  |
| text_over_flow | [TextOverFlow](#components-text-v1-TextOverFlow) |  |  |
| android_typography | [AndroidTypography](#components-text-v1-AndroidTypography) | optional |  |
| ios_typography | [IOSTypography](#components-text-v1-IOSTypography) | optional |  |





 


<a name="components-text-v1-AndroidTypography"></a>

### AndroidTypography


| Name | Number | Description |
| ---- | ------ | ----------- |
| displayLarge | 0 |  |
| displayMedium | 1 |  |
| displaySmall | 2 |  |
| headlineLarge | 3 |  |
| headlineMedium | 4 |  |
| headlineSmall | 5 |  |
| titleLarge | 6 |  |
| titleMedium | 7 |  |
| titleSmall | 8 |  |
| bodyLarge | 9 |  |
| bodyMedium | 10 |  |
| bodySmall | 11 |  |
| labelLarge | 12 |  |
| labelMedium | 13 |  |
| labelSmall | 14 |  |



<a name="components-text-v1-IOSTypography"></a>

### IOSTypography


| Name | Number | Description |
| ---- | ------ | ----------- |
| largeTitle | 0 |  |
| title_1 | 1 |  |
| title_2 | 2 |  |
| title_3 | 3 |  |
| headline | 4 |  |
| body | 5 |  |
| callout | 6 |  |
| subhead | 7 |  |
| footnote | 8 |  |
| caption_1 | 9 |  |
| caption_2 | 10 |  |



<a name="components-text-v1-TextOverFlow"></a>

### TextOverFlow


| Name | Number | Description |
| ---- | ------ | ----------- |
| WRAP | 0 |  |
| ELIPSES | 1 |  |
| CLIP | 2 |  |


 

 

 



## Scalar Value Types

| .proto Type | Notes | C++ | Java | Python | Go | C# | PHP | Ruby |
| ----------- | ----- | --- | ---- | ------ | -- | -- | --- | ---- |
| <a name="double" /> double |  | double | double | float | float64 | double | float | Float |
| <a name="float" /> float |  | float | float | float | float32 | float | float | Float |
| <a name="int32" /> int32 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint32 instead. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="int64" /> int64 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint64 instead. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="uint32" /> uint32 | Uses variable-length encoding. | uint32 | int | int/long | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="uint64" /> uint64 | Uses variable-length encoding. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum or Fixnum (as required) |
| <a name="sint32" /> sint32 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int32s. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sint64" /> sint64 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int64s. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="fixed32" /> fixed32 | Always four bytes. More efficient than uint32 if values are often greater than 2^28. | uint32 | int | int | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="fixed64" /> fixed64 | Always eight bytes. More efficient than uint64 if values are often greater than 2^56. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum |
| <a name="sfixed32" /> sfixed32 | Always four bytes. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sfixed64" /> sfixed64 | Always eight bytes. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="bool" /> bool |  | bool | boolean | boolean | bool | bool | boolean | TrueClass/FalseClass |
| <a name="string" /> string | A string must always contain UTF-8 encoded or 7-bit ASCII text. | string | String | str/unicode | string | string | string | String (UTF-8) |
| <a name="bytes" /> bytes | May contain any arbitrary sequence of bytes. | string | ByteString | str | []byte | ByteString | string | String (ASCII-8BIT) |

