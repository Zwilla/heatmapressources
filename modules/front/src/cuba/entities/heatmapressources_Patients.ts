import { StandardEntity } from "./base/sys$StandardEntity";
import { Humans } from "./heatmapressources_Humans";
export class Patients extends StandardEntity {
  static NAME = "heatmapressources_Patients";
  patient_Human?: Humans | null;
  patient_Number?: any | null;
  patient_Disease?: string | null;
  patient_UniqueIdentityNumber?: string | null;
  patient_BirthDay?: any | null;
  patient_EmergencyContact?: string | null;
  patient_LastName?: string | null;
  patient_FristName?: string | null;
}
export type PatientsViewName = "_minimal" | "_local" | "_base";
export type PatientsView<V extends PatientsViewName> = V extends "_minimal"
  ? Pick<Patients, "id" | "patient_UniqueIdentityNumber">
  : V extends "_local"
  ? Pick<
      Patients,
      | "id"
      | "patient_Number"
      | "patient_Disease"
      | "patient_UniqueIdentityNumber"
      | "patient_BirthDay"
      | "patient_EmergencyContact"
      | "patient_LastName"
      | "patient_FristName"
    >
  : V extends "_base"
  ? Pick<
      Patients,
      | "id"
      | "patient_UniqueIdentityNumber"
      | "patient_Number"
      | "patient_Disease"
      | "patient_BirthDay"
      | "patient_EmergencyContact"
      | "patient_LastName"
      | "patient_FristName"
    >
  : never;
