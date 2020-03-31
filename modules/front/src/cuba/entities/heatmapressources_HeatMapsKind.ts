import { StandardEntity } from "./base/sys$StandardEntity";
export class HeatMapsKind extends StandardEntity {
  static NAME = "heatmapressources_HeatMapsKind";
  heatMaps_KindName?: string | null;
  heatMaps_Kind_description?: string | null;
}
export type HeatMapsKindViewName = "_minimal" | "_local" | "_base";
export type HeatMapsKindView<
  V extends HeatMapsKindViewName
> = V extends "_minimal"
  ? Pick<HeatMapsKind, "id" | "heatMaps_KindName">
  : V extends "_local"
  ? Pick<HeatMapsKind, "id" | "heatMaps_KindName" | "heatMaps_Kind_description">
  : V extends "_base"
  ? Pick<HeatMapsKind, "id" | "heatMaps_KindName" | "heatMaps_Kind_description">
  : never;
