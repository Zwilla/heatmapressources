import { StandardEntity } from "./base/sys$StandardEntity";
import { HeatMapsKind } from "./heatmapressources_HeatMapsKind";
export class HeatMaps_Global extends StandardEntity {
  static NAME = "heatmapressources_HeatMaps_All";
  hm_KindOf?: HeatMapsKind | null;
  hm_Description?: string | null;
}
export type HeatMaps_GlobalViewName = "_minimal" | "_local" | "_base";
export type HeatMaps_GlobalView<
  V extends HeatMaps_GlobalViewName
> = V extends "_minimal"
  ? Pick<HeatMaps_Global, "id" | "hm_KindOf" | "hm_Description">
  : V extends "_local"
  ? Pick<HeatMaps_Global, "id" | "hm_Description">
  : V extends "_base"
  ? Pick<HeatMaps_Global, "id" | "hm_KindOf" | "hm_Description">
  : never;
