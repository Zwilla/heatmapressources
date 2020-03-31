import { StandardEntity } from "./base/sys$StandardEntity";
export class HeatMap_Humans5G extends StandardEntity {
  static NAME = "heatmapressources_HeatMap_Humans5G";
  hm_Imei?: string | null;
  hmH_Location?: any | null;
  has_corona_since?: any | null;
}
export type HeatMap_Humans5GViewName = "_minimal" | "_local" | "_base";
export type HeatMap_Humans5GView<
  V extends HeatMap_Humans5GViewName
> = V extends "_minimal"
  ? Pick<HeatMap_Humans5G, "id" | "hm_Imei">
  : V extends "_local"
  ? Pick<
      HeatMap_Humans5G,
      "id" | "hm_Imei" | "hmH_Location" | "has_corona_since"
    >
  : V extends "_base"
  ? Pick<
      HeatMap_Humans5G,
      "id" | "hm_Imei" | "hmH_Location" | "has_corona_since"
    >
  : never;
