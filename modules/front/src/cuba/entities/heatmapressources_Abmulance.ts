import { ControlCenter } from "./heatmapressources_ControlCenter";
export class Abmulance extends ControlCenter {
  static NAME = "heatmapressources_Abmulance";
  a_Name?: string | null;
  a_ControlCenter?: ControlCenter | null;
  a_Location?: any | null;
  a_tracking_source?: string | null;
  a_Type?: string | null;
  a_directContact?: string | null;
}
export type AbmulanceViewName = "_minimal" | "_local" | "_base";
export type AbmulanceView<V extends AbmulanceViewName> = V extends "_minimal"
  ? Pick<Abmulance, "id" | "a_Name">
  : V extends "_local"
  ? Pick<
      Abmulance,
      | "id"
      | "a_Name"
      | "a_Location"
      | "a_tracking_source"
      | "a_Type"
      | "a_directContact"
      | "cc_Name"
      | "cc_location"
      | "cc_Contact"
      | "cc_MainTrackingSources"
    >
  : V extends "_base"
  ? Pick<
      Abmulance,
      | "id"
      | "a_Name"
      | "a_Location"
      | "a_tracking_source"
      | "a_Type"
      | "a_directContact"
      | "cc_Name"
      | "cc_location"
      | "cc_Contact"
      | "cc_MainTrackingSources"
    >
  : never;
