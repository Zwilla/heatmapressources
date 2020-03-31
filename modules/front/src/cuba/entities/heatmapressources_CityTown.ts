import { StandardEntity } from "./base/sys$StandardEntity";
import { Country } from "./heatmapressources_Country";
import { StateProvinceDistrict } from "./heatmapressources_StateProvinceDistrict";
import { Humans } from "./heatmapressources_Humans";
export class CityTown extends StandardEntity {
  static NAME = "heatmapressources_CityTown";
  ct_Country?: Country | null;
  ct_location?: any | null;
  ct_Name?: string | null;
  ct_description?: string | null;
  ct_ZipCode?: string | null;
  ct_Emergency_Contact?: string | null;
  ct_stateProvinceDistrictName?: StateProvinceDistrict | null;
  ct_EmergencyContact?: Humans | null;
}
export type CityTownViewName = "_minimal" | "_local" | "_base";
export type CityTownView<V extends CityTownViewName> = V extends "_minimal"
  ? Pick<CityTown, "id" | "ct_Country">
  : V extends "_local"
  ? Pick<
      CityTown,
      | "id"
      | "ct_location"
      | "ct_Name"
      | "ct_description"
      | "ct_ZipCode"
      | "ct_Emergency_Contact"
    >
  : V extends "_base"
  ? Pick<
      CityTown,
      | "id"
      | "ct_Country"
      | "ct_location"
      | "ct_Name"
      | "ct_description"
      | "ct_ZipCode"
      | "ct_Emergency_Contact"
    >
  : never;
