import { StandardEntity } from "./base/sys$StandardEntity";
import { Humans } from "./heatmapressources_Humans";
export class StateProvinceDistrict extends StandardEntity {
  static NAME = "heatmapressources_StateProvinceDistrict";
  countryName?: StateProvinceDistrict | null;
  stateProvinceDistrictName?: string | null;
  description?: string | null;
  spd_EmergencyContact?: Humans | null;
}
export type StateProvinceDistrictViewName = "_minimal" | "_local" | "_base";
export type StateProvinceDistrictView<
  V extends StateProvinceDistrictViewName
> = V extends "_minimal"
  ? Pick<StateProvinceDistrict, "id" | "description">
  : V extends "_local"
  ? Pick<
      StateProvinceDistrict,
      "id" | "stateProvinceDistrictName" | "description"
    >
  : V extends "_base"
  ? Pick<
      StateProvinceDistrict,
      "id" | "description" | "stateProvinceDistrictName"
    >
  : never;
