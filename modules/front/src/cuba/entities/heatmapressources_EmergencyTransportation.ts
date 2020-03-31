import { StandardEntity } from "./base/sys$StandardEntity";
import { ControlCenter } from "./heatmapressources_ControlCenter";
export class EmergencyTransportation extends StandardEntity {
  static NAME = "heatmapressources_EmergencyTransportation";
  et_Name?: string | null;
  et_ControlCenter?: ControlCenter | null;
  et_Ambulance_UUID?: string | null;
  et_Emergency_Helicopter?: string | null;
  et_location?: any | null;
  et_tracking_source?: string | null;
}
export type EmergencyTransportationViewName = "_minimal" | "_local" | "_base";
export type EmergencyTransportationView<
  V extends EmergencyTransportationViewName
> = V extends "_minimal"
  ? Pick<EmergencyTransportation, "id" | "et_Name">
  : V extends "_local"
  ? Pick<
      EmergencyTransportation,
      | "id"
      | "et_Name"
      | "et_Ambulance_UUID"
      | "et_Emergency_Helicopter"
      | "et_location"
      | "et_tracking_source"
    >
  : V extends "_base"
  ? Pick<
      EmergencyTransportation,
      | "id"
      | "et_Name"
      | "et_Ambulance_UUID"
      | "et_Emergency_Helicopter"
      | "et_location"
      | "et_tracking_source"
    >
  : never;
