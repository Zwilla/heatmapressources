import { StandardEntity } from "./base/sys$StandardEntity";
import { CityTown } from "./heatmapressources_CityTown";
export class ControlCenter extends StandardEntity {
  static NAME = "heatmapressources_ControlCenter";
  cc_Name?: string | null;
  cc_location?: any | null;
  cc_Contact?: string | null;
  cc_MainTrackingSources?: string | null;
  cc_City?: CityTown | null;
}
export type ControlCenterViewName = "_minimal" | "_local" | "_base";
export type ControlCenterView<
  V extends ControlCenterViewName
> = V extends "_minimal"
  ? Pick<ControlCenter, "id" | "cc_Name">
  : V extends "_local"
  ? Pick<
      ControlCenter,
      "id" | "cc_Name" | "cc_location" | "cc_Contact" | "cc_MainTrackingSources"
    >
  : V extends "_base"
  ? Pick<
      ControlCenter,
      "id" | "cc_Name" | "cc_location" | "cc_Contact" | "cc_MainTrackingSources"
    >
  : never;
