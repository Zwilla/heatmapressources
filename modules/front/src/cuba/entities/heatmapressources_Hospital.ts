import { StandardEntity } from "./base/sys$StandardEntity";
import { ControlCenter } from "./heatmapressources_ControlCenter";
export class Hospital extends StandardEntity {
  static NAME = "heatmapressources_Hospital";
  h_ControlCenter?: ControlCenter | null;
  h_location_uuid?: string | null;
  h_address?: string | null;
  h_Name?: string | null;
  h_location?: any | null;
  h_maxRooms?: number | null;
  h_Rooms_With_RespiratoryVentilator?: number | null;
  h_Rooms_With_RespiratoryVentilator_Free?: number | null;
  h_IntensiveCareUnits?: number | null;
  h_description?: string | null;
}
export type HospitalViewName = "_minimal" | "_local" | "_base";
export type HospitalView<V extends HospitalViewName> = V extends "_minimal"
  ? Pick<Hospital, "id" | "h_Name">
  : V extends "_local"
  ? Pick<
      Hospital,
      | "id"
      | "h_location_uuid"
      | "h_address"
      | "h_Name"
      | "h_location"
      | "h_maxRooms"
      | "h_Rooms_With_RespiratoryVentilator"
      | "h_Rooms_With_RespiratoryVentilator_Free"
      | "h_IntensiveCareUnits"
      | "h_description"
    >
  : V extends "_base"
  ? Pick<
      Hospital,
      | "id"
      | "h_Name"
      | "h_location_uuid"
      | "h_address"
      | "h_location"
      | "h_maxRooms"
      | "h_Rooms_With_RespiratoryVentilator"
      | "h_Rooms_With_RespiratoryVentilator_Free"
      | "h_IntensiveCareUnits"
      | "h_description"
    >
  : never;
