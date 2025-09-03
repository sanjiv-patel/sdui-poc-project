# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [components/properties/v1/action.proto](#components_properties_v1_action-proto)
    - [Action](#components-properties-v1-Action)
  
    - [ActionType](#components-properties-v1-ActionType)
  
- [components/properties/v1/text_alignment.proto](#components_properties_v1_text_alignment-proto)
    - [TextAlignment](#components-properties-v1-TextAlignment)
  
- [components/properties/v1/shape.proto](#components_properties_v1_shape-proto)
    - [Border](#components-properties-v1-Border)
    - [RoundedCorners](#components-properties-v1-RoundedCorners)
    - [Shape](#components-properties-v1-Shape)
  
- [components/properties/v1/ui_component.proto](#components_properties_v1_ui_component-proto)
    - [SDUIComponent](#components-properties-v1-SDUIComponent)
  
    - [ComponentType](#components-properties-v1-ComponentType)
  
- [Scalar Value Types](#scalar-value-types)



<a name="components_properties_v1_action-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## components/properties/v1/action.proto



<a name="components-properties-v1-Action"></a>

### Action



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| action_type | [ActionType](#components-properties-v1-ActionType) |  |  |
| action_value | [string](#string) |  |  |
| destination | [string](#string) |  |  |





 


<a name="components-properties-v1-ActionType"></a>

### ActionType


| Name | Number | Description |
| ---- | ------ | ----------- |
| NAVIGATION | 0 |  |
| API_CALL | 1 |  |


 

 

 



<a name="components_properties_v1_text_alignment-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## components/properties/v1/text_alignment.proto


 


<a name="components-properties-v1-TextAlignment"></a>

### TextAlignment


| Name | Number | Description |
| ---- | ------ | ----------- |
| CENTER | 0 |  |
| START | 1 |  |
| END | 2 |  |


 

 

 



<a name="components_properties_v1_shape-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## components/properties/v1/shape.proto



<a name="components-properties-v1-Border"></a>

### Border



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| width | [int32](#int32) |  |  |
| color | [string](#string) |  |  |
| gradients | [string](#string) | repeated |  |






<a name="components-properties-v1-RoundedCorners"></a>

### RoundedCorners



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| all | [int32](#int32) | optional |  |
| left | [int32](#int32) | optional |  |
| right | [int32](#int32) | optional |  |
| top | [int32](#int32) | optional |  |
| bottom | [int32](#int32) | optional |  |






<a name="components-properties-v1-Shape"></a>

### Shape



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| corners | [RoundedCorners](#components-properties-v1-RoundedCorners) | optional |  |
| border | [Border](#components-properties-v1-Border) | optional |  |





 

 

 

 



<a name="components_properties_v1_ui_component-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## components/properties/v1/ui_component.proto



<a name="components-properties-v1-SDUIComponent"></a>

### SDUIComponent



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [ComponentType](#components-properties-v1-ComponentType) |  |  |
| data | [google.protobuf.Any](#google-protobuf-Any) |  |  |





 


<a name="components-properties-v1-ComponentType"></a>

### ComponentType


| Name | Number | Description |
| ---- | ------ | ----------- |
| BUTTON | 0 |  |
| TEXT | 1 |  |
| IMAGE | 2 |  |
| OFFER_CARD | 3 |  |
| COLUMN | 4 |  |
| ROW | 5 |  |
| GRID | 6 |  |


 

 

 



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

