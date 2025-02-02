package org.test.automation.utils;

import java.util.Map;
import java.util.Set;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONUtils {

	public static Set<String> getAllKeys(String jsonObject) throws JsonMappingException, JsonProcessingException {
		Set<String> keysFromJsonObject = null;

		ObjectMapper objectMapper = new ObjectMapper();
		
		// Deserializing into a Map
		Map<String, String> parsedJsonObject = objectMapper.readValue(jsonObject,
				new TypeReference<Map<String, String>>() {
				});
		// Get all keys
		keysFromJsonObject = parsedJsonObject.keySet();
		

		return keysFromJsonObject;
	}

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub

		String jsonObject = "[\r\n"
				+ "    {\r\n"
				+ "        \"productIdentifiers\": {\r\n"
				+ "            \"documentId\": \"productVendor::CFHH::C709::5789-USA\",\r\n"
				+ "            \"brandId\": \"CFHH\",\r\n"
				+ "            \"subBrandId\": null,\r\n"
				+ "            \"manufacturerPartNumberId\": \"C709\",\r\n"
				+ "            \"merchandiseVendorOwnershipId\": \"5789-USA\",\r\n"
				+ "            \"partTerminologyId\": \"1704\",\r\n"
				+ "            \"partTerminologyName\": null,\r\n"
				+ "            \"itemId\": \"0000000000897409\"\r\n"
				+ "        },\r\n"
				+ "        \"productHeader\": null,\r\n"
				+ "        \"item\": {\r\n"
				+ "            \"hazardousMaterialFlag\": null,\r\n"
				+ "            \"manufacturerBaseItemCode\": null,\r\n"
				+ "            \"manufacturerItemGTINId\": \"00192630057377\",\r\n"
				+ "            \"brandNames\": {\r\n"
				+ "                \"EN_US\": \"Duralast\"\r\n"
				+ "            },\r\n"
				+ "            \"subBrandNames\": null,\r\n"
				+ "            \"isApplicationSpecificFlag\": null,\r\n"
				+ "            \"itemSizeQuantity\": \"1\",\r\n"
				+ "            \"itemSizeQuantityUnitOfMeasure\": \"EA\",\r\n"
				+ "            \"manufacturerItemGTINQualifierCode\": \"UP\",\r\n"
				+ "            \"container\": \"EA\",\r\n"
				+ "            \"perApplicationQuantityQualifier\": \"NOR\",\r\n"
				+ "            \"perApplicationQuantity\": 1,\r\n"
				+ "            \"perApplicationQuantityUOMCode\": \"EA\",\r\n"
				+ "            \"vendorItemPriceLevelEffectiveDate\": null,\r\n"
				+ "            \"vendorItemAvailableForSaleDate\": null,\r\n"
				+ "            \"vendorMinimumOrderQuantity\": 0,\r\n"
				+ "            \"vendorMinimumOrderQuantityUOMCode\": null,\r\n"
				+ "            \"manufacturerProductCodes\": null,\r\n"
				+ "            \"productCategoryCode\": null,\r\n"
				+ "            \"itemUNSPSCCode\": null,\r\n"
				+ "            \"itemVMRSCode\": null,\r\n"
				+ "            \"itemVMRSBrandId\": null\r\n"
				+ "        },\r\n"
				+ "        \"descriptions\": {\r\n"
				+ "            \"productApplicationSummaryDescriptions\": null,\r\n"
				+ "            \"productAssociatedCommentsDescriptions\": null,\r\n"
				+ "            \"productCaptionDescriptions\": null,\r\n"
				+ "            \"productMarketingDescriptions\": {\r\n"
				+ "                \"EN_US\": [\r\n"
				+ "                    \"Duralast Remanufactured Brake Calipers are remanufactured to meet or exceed OEM performance. Each caliper includes all hardware needed for easy installation (mounting bolts not included). Duralast&apos;s caliper hardware allows for quick and easy installation because you no longer need to search for replacement components or reuse old hardware. Also, all rear parking brake hardware is installed and lubricated for your convenience, where applicable. Duralast is proud to offer remanufactured color coated brake calipers, that cover many popular domestic and import high-performance and tuner applications. All color coated brake calipers are powder coated, and are available in red or yellow. Duralast&apos;s dedication to quality and consistency is supported in our focus on facilitating caliper installation and offering you flexibility. With the freedom to choose whatever friction you desire, Duralast Remanufactured Brake Calipers can be tailored to meet your needs. This winning combination of quality, consistency, and flexibility is another example of how Duralast helps drive your business, providing a quality product both you and your vehicle can rely on.\"\r\n"
				+ "                ]\r\n"
				+ "            },\r\n"
				+ "            \"productAbbreviatedDescriptions\": {\r\n"
				+ "                \"EN_US\": [\r\n"
				+ "                    \"Brk Caliper\"\r\n"
				+ "                ]\r\n"
				+ "            },\r\n"
				+ "            \"productMarketingExtendedDescriptions\": {\r\n"
				+ "                \"EN_US\": [\r\n"
				+ "                    \"Reman Caliper wo/ Mounting Bracket\"\r\n"
				+ "                ]\r\n"
				+ "            },\r\n"
				+ "            \"productFeaturesAndBenefits\": {\r\n"
				+ "                \"EN_US\": [\r\n"
				+ "                    \"New bleeder screws provide trouble-free bleeding and a positive seal\",\r\n"
				+ "                    \"Every caliper consistently includes all hardware needed to ensure quick, convenient installation, while offering you the choice to install your own preferred grade of pads\",\r\n"
				+ "                    \"Mounting bolts not included\",\r\n"
				+ "                    \"100% pressure tested to guarantee proper function under all driving conditions\",\r\n"
				+ "                    \"100% S.A.E. specific rubber seals ensure like-new performance\",\r\n"
				+ "                    \"New copper washers are included for a perfect seal\",\r\n"
				+ "                    \"Coated to prevent corrosion and extend the life of the caliper\",\r\n"
				+ "                    \"Includes pad installation hardware\"\r\n"
				+ "                ]\r\n"
				+ "            },\r\n"
				+ "            \"productKeySearchWordsDescriptions\": {\r\n"
				+ "                \"EN_US\": [\r\n"
				+ "                    \"Caliper, Brake Caliper, Disc Brake Caliper, Unloaded Caliper, Unloaded Brake Caliper, Bracketed Caliper\"\r\n"
				+ "                ]\r\n"
				+ "            },\r\n"
				+ "            \"productLabelDescriptions\": {\r\n"
				+ "                \"EN_US\": [\r\n"
				+ "                    \"Remanufactured Disc Brake Caliper\"\r\n"
				+ "                ]\r\n"
				+ "            },\r\n"
				+ "            \"productInvoiceDescriptions\": {\r\n"
				+ "                \"EN_US\": [\r\n"
				+ "                    \"Reman Caliper wo/ Bracket\"\r\n"
				+ "                ]\r\n"
				+ "            },\r\n"
				+ "            \"productLongDescriptions\": {\r\n"
				+ "                \"EN_US\": [\r\n"
				+ "                    \"Remanufactured Disc Brake Caliper\"\r\n"
				+ "                ]\r\n"
				+ "            },\r\n"
				+ "            \"productShortDescriptions\": {\r\n"
				+ "                \"EN_US\": [\r\n"
				+ "                    \"Reman Brake Caliper\"\r\n"
				+ "                ]\r\n"
				+ "            },\r\n"
				+ "            \"productShippingRestrictionDescriptions\": null,\r\n"
				+ "            \"productLanguageDescriptions\": null,\r\n"
				+ "            \"productTranscriptionDescriptions\": null,\r\n"
				+ "            \"productUNSDescriptions\": null,\r\n"
				+ "            \"productVMRDescriptions\": null,\r\n"
				+ "            \"productPartTypeDescriptions\": {\r\n"
				+ "                \"EN_US\": [\r\n"
				+ "                    \"Disc Brake Caliper\"\r\n"
				+ "                ]\r\n"
				+ "            }\r\n"
				+ "        },\r\n"
				+ "        \"autoZoneProduct\": {\r\n"
				+ "            \"alternateLineCode\": null,\r\n"
				+ "            \"alternatePartNumberId\": null,\r\n"
				+ "            \"autozoneUPCAssignedFlag\": \"N\",\r\n"
				+ "            \"itemIdAssignedFlag\": \"N\",\r\n"
				+ "            \"partNumberId\": \"C709\",\r\n"
				+ "            \"partDescriptions\": {\r\n"
				+ "                \"EN_US\": \"DISC   BRAKE CALIPER\"\r\n"
				+ "            },\r\n"
				+ "            \"buyerGroupId\": \"WK\",\r\n"
				+ "            \"carburetorWarningLabels\": {\r\n"
				+ "                \"EN_US\": \"No\"\r\n"
				+ "            },\r\n"
				+ "            \"electronicComponentsCode\": \"No\",\r\n"
				+ "            \"coreRetailAmount\": \"30.0\",\r\n"
				+ "            \"coreVendorId\": \"18630\",\r\n"
				+ "            \"productCustomFlag\": \"N\",\r\n"
				+ "            \"productDiscountFlag\": \"Y\",\r\n"
				+ "            \"warehouses\": [\r\n"
				+ "                {\r\n"
				+ "                    \"warehouseId\": \"10,11,20,22,77,88,99\",\r\n"
				+ "                    \"purchaseOrderVendorId\": \"18630\"\r\n"
				+ "                }\r\n"
				+ "            ],\r\n"
				+ "            \"deletedFlag\": \"N\",\r\n"
				+ "            \"chemicalCode\": \"No\",\r\n"
				+ "            \"batteryCode\": \"No\",\r\n"
				+ "            \"bulbCode\": \"No\",\r\n"
				+ "            \"propSixtyFiveCaliforniaFlag\": \"Y\",\r\n"
				+ "            \"propSixtyFiveCaliforniaLabels\": {\r\n"
				+ "                \"EN_US\": \"WARNING: Cancer and Reproductive Harm.\"\r\n"
				+ "            },\r\n"
				+ "            \"itemCarbAffectedFlag\": \"N\",\r\n"
				+ "            \"lineCode\": \"FEN\",\r\n"
				+ "            \"michiganFlag\": \"N\",\r\n"
				+ "            \"oilGallonQuantity\": \"0.0\",\r\n"
				+ "            \"productCompareDescriptions\": {},\r\n"
				+ "            \"quantityForcedFlag\": \"N\",\r\n"
				+ "            \"recallVendorId\": \"18630\",\r\n"
				+ "            \"recordSequenceId\": null,\r\n"
				+ "            \"retailCostAmount\": \"999.999\",\r\n"
				+ "            \"shipRoundQuantity\": \"1\",\r\n"
				+ "            \"shipRoundQuantityUnityOfMeasureCode\": null,\r\n"
				+ "            \"storeCreditFlag\": \"Y\",\r\n"
				+ "            \"storeOrderPackQuantity\": 1,\r\n"
				+ "            \"storeOrderPackQuantityUnitOfMeasureCode\": null,\r\n"
				+ "            \"inventoryControllerId\": \"BB\",\r\n"
				+ "            \"ediOrderUnitOfMeasureCode\": \"EA\",\r\n"
				+ "            \"warrantyToBeRecordedFlag\": \"Y\",\r\n"
				+ "            \"warrantyMonthsQuantity\": 999,\r\n"
				+ "            \"warrantyVendorId\": \"18630\",\r\n"
				+ "            \"wercsResponseCode\": null,\r\n"
				+ "            \"dataSourceStandardCode\": \"PIES\",\r\n"
				+ "            \"storeOrderMinimumEachQuantity\": null,\r\n"
				+ "            \"storeOrderMaximumEachQuantity\": null,\r\n"
				+ "            \"legacyPerCaseQuantity\": 1,\r\n"
				+ "            \"storeTaxCode\": null,\r\n"
				+ "            \"warehouseTaxCode\": null,\r\n"
				+ "            \"majorDepartmentId\": 4,\r\n"
				+ "            \"minorDepartmentId\": 29,\r\n"
				+ "            \"skuResponseFlag\": null,\r\n"
				+ "            \"marketingFlag\": \"Y\",\r\n"
				+ "            \"maxPerCarQuantity\": null,\r\n"
				+ "            \"productTitleDescriptions\": {\r\n"
				+ "                \"EN_US\": \"Duralast Brake Caliper C709\"\r\n"
				+ "            }\r\n"
				+ "        },\r\n"
				+ "        \"partAttributes\": [\r\n"
				+ "            {\r\n"
				+ "                \"attributeId\": \"padb419\",\r\n"
				+ "                \"padbDescriptions\": {\r\n"
				+ "                    \"EN_US\": {\r\n"
				+ "                        \"label\": \"Pads Included\",\r\n"
				+ "                        \"value\": \"No\",\r\n"
				+ "                        \"unitOfMeasureCode\": null,\r\n"
				+ "                        \"unitOfMeasureLabelName\": null,\r\n"
				+ "                        \"sequenceNumber\": 0,\r\n"
				+ "                        \"multiValueQuantity\": 0,\r\n"
				+ "                        \"multiValueSequenceNumber\": 0\r\n"
				+ "                    }\r\n"
				+ "                }\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"attributeId\": \"padb3390\",\r\n"
				+ "                \"padbDescriptions\": {\r\n"
				+ "                    \"EN_US\": {\r\n"
				+ "                        \"label\": \"Grade Type\",\r\n"
				+ "                        \"value\": \"Regular\",\r\n"
				+ "                        \"unitOfMeasureCode\": null,\r\n"
				+ "                        \"unitOfMeasureLabelName\": null,\r\n"
				+ "                        \"sequenceNumber\": 0,\r\n"
				+ "                        \"multiValueQuantity\": 0,\r\n"
				+ "                        \"multiValueSequenceNumber\": 0\r\n"
				+ "                    }\r\n"
				+ "                }\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"attributeId\": \"padb30\",\r\n"
				+ "                \"padbDescriptions\": {\r\n"
				+ "                    \"EN_US\": {\r\n"
				+ "                        \"label\": \"Mounting Hardware Included\",\r\n"
				+ "                        \"value\": \"Yes\",\r\n"
				+ "                        \"unitOfMeasureCode\": null,\r\n"
				+ "                        \"unitOfMeasureLabelName\": null,\r\n"
				+ "                        \"sequenceNumber\": 0,\r\n"
				+ "                        \"multiValueQuantity\": 0,\r\n"
				+ "                        \"multiValueSequenceNumber\": 0\r\n"
				+ "                    }\r\n"
				+ "                }\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"attributeId\": \"padb9611\",\r\n"
				+ "                \"padbDescriptions\": {\r\n"
				+ "                    \"EN_US\": {\r\n"
				+ "                        \"label\": \"Caliper Finish\",\r\n"
				+ "                        \"value\": \"Rust Preventative\",\r\n"
				+ "                        \"unitOfMeasureCode\": null,\r\n"
				+ "                        \"unitOfMeasureLabelName\": null,\r\n"
				+ "                        \"sequenceNumber\": 0,\r\n"
				+ "                        \"multiValueQuantity\": 0,\r\n"
				+ "                        \"multiValueSequenceNumber\": 0\r\n"
				+ "                    }\r\n"
				+ "                }\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"attributeId\": \"padb64\",\r\n"
				+ "                \"padbDescriptions\": {\r\n"
				+ "                    \"EN_US\": {\r\n"
				+ "                        \"label\": \"Piston Quantity\",\r\n"
				+ "                        \"value\": \"1\",\r\n"
				+ "                        \"unitOfMeasureCode\": null,\r\n"
				+ "                        \"unitOfMeasureLabelName\": null,\r\n"
				+ "                        \"sequenceNumber\": 0,\r\n"
				+ "                        \"multiValueQuantity\": 0,\r\n"
				+ "                        \"multiValueSequenceNumber\": 0\r\n"
				+ "                    },\r\n"
				+ "                    \"ES_MX\": {\r\n"
				+ "                        \"label\": \"Cantidad de pistones\",\r\n"
				+ "                        \"value\": \"1\",\r\n"
				+ "                        \"unitOfMeasureCode\": null,\r\n"
				+ "                        \"unitOfMeasureLabelName\": null,\r\n"
				+ "                        \"sequenceNumber\": 0,\r\n"
				+ "                        \"multiValueQuantity\": 0,\r\n"
				+ "                        \"multiValueSequenceNumber\": 0\r\n"
				+ "                    }\r\n"
				+ "                }\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"attributeId\": \"padb421\",\r\n"
				+ "                \"padbDescriptions\": {\r\n"
				+ "                    \"EN_US\": {\r\n"
				+ "                        \"label\": \"Caliper Casting Material\",\r\n"
				+ "                        \"value\": \"Aluminum\",\r\n"
				+ "                        \"unitOfMeasureCode\": null,\r\n"
				+ "                        \"unitOfMeasureLabelName\": null,\r\n"
				+ "                        \"sequenceNumber\": 0,\r\n"
				+ "                        \"multiValueQuantity\": 0,\r\n"
				+ "                        \"multiValueSequenceNumber\": 0\r\n"
				+ "                    }\r\n"
				+ "                }\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"attributeId\": \"padb92\",\r\n"
				+ "                \"padbDescriptions\": {\r\n"
				+ "                    \"EN_US\": {\r\n"
				+ "                        \"label\": \"Mounting Bracket Included\",\r\n"
				+ "                        \"value\": \"No\",\r\n"
				+ "                        \"unitOfMeasureCode\": null,\r\n"
				+ "                        \"unitOfMeasureLabelName\": null,\r\n"
				+ "                        \"sequenceNumber\": 0,\r\n"
				+ "                        \"multiValueQuantity\": 0,\r\n"
				+ "                        \"multiValueSequenceNumber\": 0\r\n"
				+ "                    }\r\n"
				+ "                }\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"attributeId\": \"padb5005\",\r\n"
				+ "                \"padbDescriptions\": {\r\n"
				+ "                    \"EN_US\": {\r\n"
				+ "                        \"label\": \"Bleeder Screw Included\",\r\n"
				+ "                        \"value\": \"Yes\",\r\n"
				+ "                        \"unitOfMeasureCode\": null,\r\n"
				+ "                        \"unitOfMeasureLabelName\": null,\r\n"
				+ "                        \"sequenceNumber\": 0,\r\n"
				+ "                        \"multiValueQuantity\": 0,\r\n"
				+ "                        \"multiValueSequenceNumber\": 0\r\n"
				+ "                    }\r\n"
				+ "                }\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"attributeId\": \"padb9059\",\r\n"
				+ "                \"padbDescriptions\": {\r\n"
				+ "                    \"EN_US\": {\r\n"
				+ "                        \"label\": \"Abutment Clips Included\",\r\n"
				+ "                        \"value\": \"No\",\r\n"
				+ "                        \"unitOfMeasureCode\": null,\r\n"
				+ "                        \"unitOfMeasureLabelName\": null,\r\n"
				+ "                        \"sequenceNumber\": 0,\r\n"
				+ "                        \"multiValueQuantity\": 0,\r\n"
				+ "                        \"multiValueSequenceNumber\": 0\r\n"
				+ "                    }\r\n"
				+ "                }\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"attributeId\": \"padb351\",\r\n"
				+ "                \"padbDescriptions\": {\r\n"
				+ "                    \"EN_US\": {\r\n"
				+ "                        \"label\": \"Casting Number\",\r\n"
				+ "                        \"value\": \"K244-079C\",\r\n"
				+ "                        \"unitOfMeasureCode\": null,\r\n"
				+ "                        \"unitOfMeasureLabelName\": null,\r\n"
				+ "                        \"sequenceNumber\": 0,\r\n"
				+ "                        \"multiValueQuantity\": 0,\r\n"
				+ "                        \"multiValueSequenceNumber\": 0\r\n"
				+ "                    }\r\n"
				+ "                }\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"attributeId\": \"padb8247\",\r\n"
				+ "                \"padbDescriptions\": {\r\n"
				+ "                    \"EN_US\": {\r\n"
				+ "                        \"label\": \"Caliper Color\",\r\n"
				+ "                        \"value\": \"Grey\",\r\n"
				+ "                        \"unitOfMeasureCode\": null,\r\n"
				+ "                        \"unitOfMeasureLabelName\": null,\r\n"
				+ "                        \"sequenceNumber\": 0,\r\n"
				+ "                        \"multiValueQuantity\": 0,\r\n"
				+ "                        \"multiValueSequenceNumber\": 0\r\n"
				+ "                    }\r\n"
				+ "                }\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"attributeId\": \"padb95\",\r\n"
				+ "                \"padbDescriptions\": {\r\n"
				+ "                    \"EN_US\": {\r\n"
				+ "                        \"label\": \"Piston Material\",\r\n"
				+ "                        \"value\": \"Phenolic\",\r\n"
				+ "                        \"unitOfMeasureCode\": null,\r\n"
				+ "                        \"unitOfMeasureLabelName\": null,\r\n"
				+ "                        \"sequenceNumber\": 0,\r\n"
				+ "                        \"multiValueQuantity\": 0,\r\n"
				+ "                        \"multiValueSequenceNumber\": 0\r\n"
				+ "                    }\r\n"
				+ "                }\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"attributeId\": \"padb9544\",\r\n"
				+ "                \"padbDescriptions\": {\r\n"
				+ "                    \"EN_US\": {\r\n"
				+ "                        \"label\": \"Inlet Thread Size\",\r\n"
				+ "                        \"value\": \"M10-1.0\",\r\n"
				+ "                        \"unitOfMeasureCode\": null,\r\n"
				+ "                        \"unitOfMeasureLabelName\": null,\r\n"
				+ "                        \"sequenceNumber\": 0,\r\n"
				+ "                        \"multiValueQuantity\": 0,\r\n"
				+ "                        \"multiValueSequenceNumber\": 0\r\n"
				+ "                    }\r\n"
				+ "                }\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"attributeId\": \"padb7569\",\r\n"
				+ "                \"padbDescriptions\": {\r\n"
				+ "                    \"EN_US\": {\r\n"
				+ "                        \"label\": \"Bleeder Screw Thread Diameter\",\r\n"
				+ "                        \"value\": \"M10-1.0 x 32\",\r\n"
				+ "                        \"unitOfMeasureCode\": \"MM\",\r\n"
				+ "                        \"unitOfMeasureLabelName\": \"mm\",\r\n"
				+ "                        \"sequenceNumber\": 0,\r\n"
				+ "                        \"multiValueQuantity\": 0,\r\n"
				+ "                        \"multiValueSequenceNumber\": 0\r\n"
				+ "                    },\r\n"
				+ "                    \"ES_MX\": {\r\n"
				+ "                        \"label\": \"Diámetro de la rosca del purgador\",\r\n"
				+ "                        \"value\": \"M10-1.0 x 32\",\r\n"
				+ "                        \"unitOfMeasureCode\": \"MM\",\r\n"
				+ "                        \"unitOfMeasureLabelName\": \"mm\",\r\n"
				+ "                        \"sequenceNumber\": 0,\r\n"
				+ "                        \"multiValueQuantity\": 0,\r\n"
				+ "                        \"multiValueSequenceNumber\": 0\r\n"
				+ "                    }\r\n"
				+ "                }\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"attributeId\": \"padb4446\",\r\n"
				+ "                \"padbDescriptions\": {\r\n"
				+ "                    \"EN_US\": {\r\n"
				+ "                        \"label\": \"Mounting Bolt Included\",\r\n"
				+ "                        \"value\": \"No\",\r\n"
				+ "                        \"unitOfMeasureCode\": null,\r\n"
				+ "                        \"unitOfMeasureLabelName\": null,\r\n"
				+ "                        \"sequenceNumber\": 0,\r\n"
				+ "                        \"multiValueQuantity\": 0,\r\n"
				+ "                        \"multiValueSequenceNumber\": 0\r\n"
				+ "                    }\r\n"
				+ "                }\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"attributeId\": \"padb56\",\r\n"
				+ "                \"padbDescriptions\": {\r\n"
				+ "                    \"EN_US\": {\r\n"
				+ "                        \"label\": \"Anti-Rattle Spring Included\",\r\n"
				+ "                        \"value\": \"No\",\r\n"
				+ "                        \"unitOfMeasureCode\": null,\r\n"
				+ "                        \"unitOfMeasureLabelName\": null,\r\n"
				+ "                        \"sequenceNumber\": 0,\r\n"
				+ "                        \"multiValueQuantity\": 0,\r\n"
				+ "                        \"multiValueSequenceNumber\": 0\r\n"
				+ "                    }\r\n"
				+ "                }\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"attributeId\": \"padb7609\",\r\n"
				+ "                \"padbDescriptions\": {\r\n"
				+ "                    \"EN_US\": {\r\n"
				+ "                        \"label\": \"Piston Diameter\",\r\n"
				+ "                        \"value\": \"54\",\r\n"
				+ "                        \"unitOfMeasureCode\": \"MM\",\r\n"
				+ "                        \"unitOfMeasureLabelName\": \"mm\",\r\n"
				+ "                        \"sequenceNumber\": 0,\r\n"
				+ "                        \"multiValueQuantity\": 0,\r\n"
				+ "                        \"multiValueSequenceNumber\": 0\r\n"
				+ "                    },\r\n"
				+ "                    \"ES_MX\": {\r\n"
				+ "                        \"label\": \"Diámetro del pistón\",\r\n"
				+ "                        \"value\": \"54\",\r\n"
				+ "                        \"unitOfMeasureCode\": \"MM\",\r\n"
				+ "                        \"unitOfMeasureLabelName\": \"mm\",\r\n"
				+ "                        \"sequenceNumber\": 0,\r\n"
				+ "                        \"multiValueQuantity\": 0,\r\n"
				+ "                        \"multiValueSequenceNumber\": 0\r\n"
				+ "                    }\r\n"
				+ "                }\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"attributeId\": \"padb57\",\r\n"
				+ "                \"padbDescriptions\": {\r\n"
				+ "                    \"EN_US\": {\r\n"
				+ "                        \"label\": \"Caliper Slides Included\",\r\n"
				+ "                        \"value\": \"Yes\",\r\n"
				+ "                        \"unitOfMeasureCode\": null,\r\n"
				+ "                        \"unitOfMeasureLabelName\": null,\r\n"
				+ "                        \"sequenceNumber\": 0,\r\n"
				+ "                        \"multiValueQuantity\": 0,\r\n"
				+ "                        \"multiValueSequenceNumber\": 0\r\n"
				+ "                    }\r\n"
				+ "                }\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"attributeId\": \"padb1217\",\r\n"
				+ "                \"padbDescriptions\": {\r\n"
				+ "                    \"EN_US\": {\r\n"
				+ "                        \"label\": \"Pad Wear Sensor Included\",\r\n"
				+ "                        \"value\": \"No\",\r\n"
				+ "                        \"unitOfMeasureCode\": null,\r\n"
				+ "                        \"unitOfMeasureLabelName\": null,\r\n"
				+ "                        \"sequenceNumber\": 0,\r\n"
				+ "                        \"multiValueQuantity\": 0,\r\n"
				+ "                        \"multiValueSequenceNumber\": 0\r\n"
				+ "                    }\r\n"
				+ "                }\r\n"
				+ "            }\r\n"
				+ "        ],\r\n"
				+ "        \"priceSheets\": null,\r\n"
				+ "        \"packageLevelDetail\": {\r\n"
				+ "            \"eachPackageGtinId\": \"00192630057377\",\r\n"
				+ "            \"eachPackageGtinUnitOfMeasureCode\": \"EA\",\r\n"
				+ "            \"eachRfidElectronicProductCode\": null,\r\n"
				+ "            \"eachPackageBarcodeCharactersCode\": null,\r\n"
				+ "            \"eachContainsEachQuantity\": 1,\r\n"
				+ "            \"eachContainsSmallerPackTypeQuantity\": null,\r\n"
				+ "            \"eachContainsSmallerPackTypeUnitOfMeasureCode\": null,\r\n"
				+ "            \"eachOrderablePackageFlag\": null,\r\n"
				+ "            \"eachPackageMerchDimensions\": [\r\n"
				+ "                {\r\n"
				+ "                    \"unitOfMeasureCode\": \"IN\",\r\n"
				+ "                    \"heightQuantity\": \"5.5\",\r\n"
				+ "                    \"widthQuantity\": \"6.188\",\r\n"
				+ "                    \"lengthQuantity\": \"7.875\"\r\n"
				+ "                }\r\n"
				+ "            ],\r\n"
				+ "            \"eachPackageShipDimensions\": [\r\n"
				+ "                {\r\n"
				+ "                    \"unitOfMeasureCode\": \"IN\",\r\n"
				+ "                    \"heightQuantity\": \"5.5\",\r\n"
				+ "                    \"widthQuantity\": \"6.188\",\r\n"
				+ "                    \"lengthQuantity\": \"7.875\"\r\n"
				+ "                }\r\n"
				+ "            ],\r\n"
				+ "            \"eachPackageWeights\": [\r\n"
				+ "                {\r\n"
				+ "                    \"unitOfMeasureCode\": \"PG\",\r\n"
				+ "                    \"weightQuantity\": \"4.2\",\r\n"
				+ "                    \"dimensionalWeightQuantity\": \"4.2\"\r\n"
				+ "                }\r\n"
				+ "            ],\r\n"
				+ "            \"eachPackageVarianceWeightPercentage\": null,\r\n"
				+ "            \"eachStackingFactorQuantity\": null,\r\n"
				+ "            \"innerPackPackageLevelGtinId\": null,\r\n"
				+ "            \"innerPackPackageLevelGtinUnitOfMeasureCode\": null,\r\n"
				+ "            \"innerPackRfidElectronicProductCode\": null,\r\n"
				+ "            \"innerPackPackageBarcodeCharactersCode\": null,\r\n"
				+ "            \"innerPackContainsEachQuantity\": null,\r\n"
				+ "            \"innerPackContainsSmallerPackTypeQuantity\": null,\r\n"
				+ "            \"innerPackContainsSmallerPackTypeUnitOfMeasureCode\": null,\r\n"
				+ "            \"innerPackOrderablePackageFlag\": null,\r\n"
				+ "            \"innerPackPackageMerchDimensions\": null,\r\n"
				+ "            \"innerPackPackageWeights\": null,\r\n"
				+ "            \"innerPackPackageVarianceWeightPercentage\": null,\r\n"
				+ "            \"innerPackStackingFactorQuantity\": null,\r\n"
				+ "            \"boxPackageLevelGtinId\": null,\r\n"
				+ "            \"boxPackageLevelGtinUnitOfMeasureCode\": null,\r\n"
				+ "            \"boxRfidElectronicProductCode\": null,\r\n"
				+ "            \"boxPackageBarcodeCharactersCode\": null,\r\n"
				+ "            \"boxContainsEachQuantity\": null,\r\n"
				+ "            \"boxContainsSmallerPackTypeQuantity\": null,\r\n"
				+ "            \"boxContainsSmallerPackTypeUnitOfMeasureCode\": null,\r\n"
				+ "            \"boxOrderablePackageFlag\": null,\r\n"
				+ "            \"boxPackageMerchDimensions\": null,\r\n"
				+ "            \"boxPackageShipDimensions\": null,\r\n"
				+ "            \"boxPackageWeights\": null,\r\n"
				+ "            \"boxPackageVarianceWeightPercentage\": null,\r\n"
				+ "            \"boxStackingFactorQuantity\": null,\r\n"
				+ "            \"casePackageLevelGtinId\": null,\r\n"
				+ "            \"casePackageLevelGtinUnitOfMeasureCode\": null,\r\n"
				+ "            \"caseRfidElectronicProductCode\": null,\r\n"
				+ "            \"casePackageBarcodeCharactersCode\": null,\r\n"
				+ "            \"caseContainsEachQuantity\": null,\r\n"
				+ "            \"caseContainsSmallerPackTypeQuantity\": null,\r\n"
				+ "            \"caseContainsSmallerPackTypeUnitOfMeasureCode\": null,\r\n"
				+ "            \"caseOrderablePackageFlag\": null,\r\n"
				+ "            \"casePackageMerchDimensions\": null,\r\n"
				+ "            \"casePackageShipDimensions\": null,\r\n"
				+ "            \"casePackageWeights\": null,\r\n"
				+ "            \"casePackageVarianceWeightPercentage\": null,\r\n"
				+ "            \"caseStackingFactorQuantity\": null,\r\n"
				+ "            \"palletPackageLevelGtinId\": null,\r\n"
				+ "            \"palletPackageLevelGtinUnitOfMeasureCode\": null,\r\n"
				+ "            \"palletRfidElectronicProductCode\": null,\r\n"
				+ "            \"palletPackageBarcodeCharactersCode\": null,\r\n"
				+ "            \"palletContainsEachQuantity\": null,\r\n"
				+ "            \"palletContainsSmallerPackTypeQuantity\": null,\r\n"
				+ "            \"palletContainsSmallerPackTypeUnitOfMeasureCode\": null,\r\n"
				+ "            \"palletOrderablePackageFlag\": null,\r\n"
				+ "            \"palletPackageMerchDimensions\": null,\r\n"
				+ "            \"palletPackageShipDimensions\": null,\r\n"
				+ "            \"palletPackageWeights\": null,\r\n"
				+ "            \"palletPackageVarianceWeightPercentage\": null,\r\n"
				+ "            \"palletStackingFactorQuantity\": null,\r\n"
				+ "            \"innerPackPackageShipDimensions\": null\r\n"
				+ "        },\r\n"
				+ "        \"hazmat\": null,\r\n"
				+ "        \"segmentExtendedProductInformation\": {\r\n"
				+ "            \"harmonizedTariffCanadianCode\": null,\r\n"
				+ "            \"manufacturerCoreReturnClassCode\": null,\r\n"
				+ "            \"manufacturerCoreReturnGroupCode\": null,\r\n"
				+ "            \"manufacturerCorePartNumberId\": null,\r\n"
				+ "            \"vendorCoreReturnDaysExpireQuantity\": 0,\r\n"
				+ "            \"countryOfOrigin1Code\": \"MX\",\r\n"
				+ "            \"countryOfOrigin2Code\": \"MX\",\r\n"
				+ "            \"countryOfOrigin3Code\": \"VN\",\r\n"
				+ "            \"countryOfOrigin4Code\": null,\r\n"
				+ "            \"countryOfOrigin5Code\": null,\r\n"
				+ "            \"emissionCode\": null,\r\n"
				+ "            \"harmonizedTariffHtsCode\": null,\r\n"
				+ "            \"harmonizedTariffScheduleBCode\": \"8708300050\",\r\n"
				+ "            \"itemLevelSpecialHandlingCode\": null,\r\n"
				+ "            \"partStdLifeCycleStatusCode\": null,\r\n"
				+ "            \"partStdLifeCycleStatusDescription\": null,\r\n"
				+ "            \"maxCasesPerPalletLayerQuantity\": 36,\r\n"
				+ "            \"naftaPreferenceCriterionCode\": null,\r\n"
				+ "            \"nationalPopularityCode\": null,\r\n"
				+ "            \"nationalPopularityDescriptions\": {},\r\n"
				+ "            \"oemPartnumberId\": null,\r\n"
				+ "            \"oemNameDescriptions\": {},\r\n"
				+ "            \"originalSupplierNameDescriptions\": {},\r\n"
				+ "            \"originalSupplierPartNumberId\": null,\r\n"
				+ "            \"palletLayerMaxQuantity\": 7,\r\n"
				+ "            \"oldManufacturerPartNumberId\": null,\r\n"
				+ "            \"manufacturerSupersededToPartNumberId\": null,\r\n"
				+ "            \"refurbishedPartCode\": null,\r\n"
				+ "            \"regulatingCityStateName\": null,\r\n"
				+ "            \"regulatingCountryId\": null,\r\n"
				+ "            \"regulatingCountyStateName\": null,\r\n"
				+ "            \"regulatingDescriptions\": {},\r\n"
				+ "            \"regulatingPostalCode\": null,\r\n"
				+ "            \"regulatingStateName\": null,\r\n"
				+ "            \"remanufacturedPartFlag\": null,\r\n"
				+ "            \"manufacturerPartReturnCode\": null,\r\n"
				+ "            \"msdsRequiredFlag\": \"N\",\r\n"
				+ "            \"msdsSheetNumberId\": null,\r\n"
				+ "            \"vendorStockStatusCode\": null,\r\n"
				+ "            \"partTaxableFlag\": null,\r\n"
				+ "            \"tradingPartnerMovementCode\": null,\r\n"
				+ "            \"vendorWarrantyDistanceQuantity\": null,\r\n"
				+ "            \"vendorWarrantyDistanceUnitOfMeasureCode\": null,\r\n"
				+ "            \"vendorWarrantySpecialTermCode\": null,\r\n"
				+ "            \"vendorWarrantySpecialTermUnitOfMeasureCode\": null,\r\n"
				+ "            \"vendorWarrantyTimeQuantity\": null,\r\n"
				+ "            \"vendorWarrantyTimeUnitOfMeasureCode\": null\r\n"
				+ "        },\r\n"
				+ "        \"prices\": [\r\n"
				+ "            {\r\n"
				+ "                \"sheetNumber\": null,\r\n"
				+ "                \"currencyCode\": \"USD\",\r\n"
				+ "                \"effectiveDate\": null,\r\n"
				+ "                \"expirationDate\": null,\r\n"
				+ "                \"code\": \"ZZ1\",\r\n"
				+ "                \"priceValue\": \"1.01\",\r\n"
				+ "                \"unitOfMeasureCode\": \"PE\",\r\n"
				+ "                \"breakQuantity\": 1,\r\n"
				+ "                \"breakQuantityUnitOfMeasureCode\": \"EA\",\r\n"
				+ "                \"multiplier\": null,\r\n"
				+ "                \"typeDescription\": \"base cost\"\r\n"
				+ "            }\r\n"
				+ "        ],\r\n"
				+ "        \"kits\": null,\r\n"
				+ "        \"imageAssets\": {\r\n"
				+ "            \"sideViewImageIds\": [\r\n"
				+ "                \"02\",\r\n"
				+ "                \"04\",\r\n"
				+ "                \"05\",\r\n"
				+ "                \"03\"\r\n"
				+ "            ]\r\n"
				+ "        }\r\n"
				+ "    }\r\n"
				+ "]";
		
		
		
		System.out.println("All keys are : ");
		getAllKeys(jsonObject).stream().forEach(k -> System.out.println(k));

	}

}
