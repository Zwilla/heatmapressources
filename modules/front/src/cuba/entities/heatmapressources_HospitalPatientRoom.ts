import { StandardEntity } from "./base/sys$StandardEntity";
import { Hospital } from "./heatmapressources_Hospital";
export class HospitalPatientRoom extends StandardEntity {
  static NAME = "heatmapressources_HospitalPatientRoom";
  hospitalRoomLocationNumder?: string | null;
  hospital_PatientRoom?: Hospital | null;
  hpr_intensiveCareRoom?: boolean | null;
  hpr_RespiratoryVentilator?: boolean | null;
  hpr_ressources?: string | null;
  description?: string | null;
}
export type HospitalPatientRoomViewName = "_minimal" | "_local" | "_base";
export type HospitalPatientRoomView<
  V extends HospitalPatientRoomViewName
> = V extends "_minimal"
  ? Pick<HospitalPatientRoom, "id" | "hospital_PatientRoom">
  : V extends "_local"
  ? Pick<
      HospitalPatientRoom,
      | "id"
      | "hospitalRoomLocationNumder"
      | "hpr_intensiveCareRoom"
      | "hpr_RespiratoryVentilator"
      | "hpr_ressources"
      | "description"
    >
  : V extends "_base"
  ? Pick<
      HospitalPatientRoom,
      | "id"
      | "hospital_PatientRoom"
      | "hospitalRoomLocationNumder"
      | "hpr_intensiveCareRoom"
      | "hpr_RespiratoryVentilator"
      | "hpr_ressources"
      | "description"
    >
  : never;
