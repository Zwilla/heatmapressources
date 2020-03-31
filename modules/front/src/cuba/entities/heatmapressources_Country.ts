import { StandardEntity } from "./base/sys$StandardEntity";
import { Humans } from "./heatmapressources_Humans";
export class Country extends StandardEntity {
  static NAME = "heatmapressources_Country";
  countryName?: string | null;
  c_EmergencyWebsite?: string | null;
  c_location?: any | null;
  c_EmergencyContact?: Humans | null;
}
export type CountryViewName = "_minimal" | "_local" | "_base";
export type CountryView<V extends CountryViewName> = V extends "_minimal"
  ? Pick<Country, "id" | "countryName">
  : V extends "_local"
  ? Pick<Country, "id" | "countryName" | "c_EmergencyWebsite" | "c_location">
  : V extends "_base"
  ? Pick<Country, "id" | "countryName" | "c_EmergencyWebsite" | "c_location">
  : never;
