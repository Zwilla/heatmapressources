import { Hospital } from "./heatmapressources_Hospital";
export class HospitalContacts extends Hospital {
  static NAME = "heatmapressources_HospitalContacts";
  hc_Hospital?: Hospital | null;
  hc_MainContact?: string | null;
  hc_PhoneNumber?: string | null;
  hc_Email?: string | null;
  hc_Faximile?: string | null;
  hc_HeadOf?: string | null;
  hc_description?: string | null;
}
export type HospitalContactsViewName = "_minimal" | "_local" | "_base";
export type HospitalContactsView<
  V extends HospitalContactsViewName
> = V extends "_minimal"
  ? Pick<HospitalContacts, "id" | "hc_description">
  : V extends "_local"
  ? Pick<
      HospitalContacts,
      | "id"
      | "hc_MainContact"
      | "hc_PhoneNumber"
      | "hc_Email"
      | "hc_Faximile"
      | "hc_HeadOf"
      | "hc_description"
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
      HospitalContacts,
      | "id"
      | "hc_description"
      | "hc_MainContact"
      | "hc_PhoneNumber"
      | "hc_Email"
      | "hc_Faximile"
      | "hc_HeadOf"
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
  : never;
