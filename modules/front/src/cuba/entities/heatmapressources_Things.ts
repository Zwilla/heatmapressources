import { StandardEntity } from "./base/sys$StandardEntity";
export class Things extends StandardEntity {
  static NAME = "heatmapressources_Things";
  things_Name?: string | null;
  things_UUID?: string | null;
  things_UUID_Tracking?: string | null;
  things_location?: any | null;
  things_TrackingSource?: string | null;
  things_TrackingLocation_API?: string | null;
  things_Kind?: string | null;
}
export type ThingsViewName = "_minimal" | "_local" | "_base";
export type ThingsView<V extends ThingsViewName> = V extends "_minimal"
  ? Pick<Things, "id" | "things_Name">
  : V extends "_local"
  ? Pick<
      Things,
      | "id"
      | "things_Name"
      | "things_UUID"
      | "things_UUID_Tracking"
      | "things_location"
      | "things_TrackingSource"
      | "things_TrackingLocation_API"
      | "things_Kind"
    >
  : V extends "_base"
  ? Pick<
      Things,
      | "id"
      | "things_Name"
      | "things_UUID"
      | "things_UUID_Tracking"
      | "things_location"
      | "things_TrackingSource"
      | "things_TrackingLocation_API"
      | "things_Kind"
    >
  : never;
