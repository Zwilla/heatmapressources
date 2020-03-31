import { StandardEntity } from "./base/sys$StandardEntity";
import { ControlCenter } from "./heatmapressources_ControlCenter";
import { Humans } from "./heatmapressources_Humans";
export class MedicalProfessionals extends StandardEntity {
  static NAME = "heatmapressources_MedicalProfessionals";
  mp_Name?: string | null;
  mp_ControlCenter?: ControlCenter | null;
  mp_UniqueSocialNumber?: string | null;
  mp_Certification?: string | null;
  hr_IMEI?: Humans | null;
}
export type MedicalProfessionalsViewName = "_minimal" | "_local" | "_base";
export type MedicalProfessionalsView<
  V extends MedicalProfessionalsViewName
> = V extends "_minimal"
  ? Pick<MedicalProfessionals, "id" | "mp_Name">
  : V extends "_local"
  ? Pick<
      MedicalProfessionals,
      "id" | "mp_Name" | "mp_UniqueSocialNumber" | "mp_Certification"
    >
  : V extends "_base"
  ? Pick<
      MedicalProfessionals,
      "id" | "mp_Name" | "mp_UniqueSocialNumber" | "mp_Certification"
    >
  : never;
