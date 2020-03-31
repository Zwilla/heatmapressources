import { StandardEntity } from "./base/sys$StandardEntity";
import { RespiratoryVentilator } from "./heatmapressources_RespiratoryVentilator";
export class HospitalRoomFacilities extends StandardEntity {
  static NAME = "heatmapressources_HospitalRoomFacilities";
  hrf_Name?: string | null;
  intensiveCareBedsNumber?: number | null;
  rv_RespiratoryVentilator?: RespiratoryVentilator | null;
  hrf_location_tracking?: any | null;
  hrf_location_tracking_source?: any | null;
  description?: string | null;
}
export type HospitalRoomFacilitiesViewName = "_minimal" | "_local" | "_base";
export type HospitalRoomFacilitiesView<
  V extends HospitalRoomFacilitiesViewName
> = V extends "_minimal"
  ? Pick<HospitalRoomFacilities, "id" | "hrf_Name">
  : V extends "_local"
  ? Pick<
      HospitalRoomFacilities,
      | "id"
      | "hrf_Name"
      | "intensiveCareBedsNumber"
      | "hrf_location_tracking"
      | "hrf_location_tracking_source"
      | "description"
    >
  : V extends "_base"
  ? Pick<
      HospitalRoomFacilities,
      | "id"
      | "hrf_Name"
      | "intensiveCareBedsNumber"
      | "hrf_location_tracking"
      | "hrf_location_tracking_source"
      | "description"
    >
  : never;
