import { StandardEntity } from "./base/sys$StandardEntity";
export class RespiratoryVentilator extends StandardEntity {
  static NAME = "heatmapressources_RespiratoryVentilator";
  rv_RespiratoryVentilator_SerialNo?: string | null;
  rv_RespiratoryVentilator_ModellNo?: string | null;
  rv_RespiratoryVentilator_Type?: string | null;
  rv_RespiratoryVentilator_Manufacturer?: string | null;
  rv_RespiratoryVentilator_Protable?: boolean | null;
  rv_RespiratoryVentilator_MaxPatients?: number | null;
  rv_RespiratoryVentilator_Description?: string | null;
  rv_location?: any | null;
}
export type RespiratoryVentilatorViewName = "_minimal" | "_local" | "_base";
export type RespiratoryVentilatorView<
  V extends RespiratoryVentilatorViewName
> = V extends "_minimal"
  ? Pick<RespiratoryVentilator, "id" | "rv_RespiratoryVentilator_SerialNo">
  : V extends "_local"
  ? Pick<
      RespiratoryVentilator,
      | "id"
      | "rv_RespiratoryVentilator_SerialNo"
      | "rv_RespiratoryVentilator_ModellNo"
      | "rv_RespiratoryVentilator_Type"
      | "rv_RespiratoryVentilator_Manufacturer"
      | "rv_RespiratoryVentilator_Protable"
      | "rv_RespiratoryVentilator_MaxPatients"
      | "rv_RespiratoryVentilator_Description"
      | "rv_location"
    >
  : V extends "_base"
  ? Pick<
      RespiratoryVentilator,
      | "id"
      | "rv_RespiratoryVentilator_SerialNo"
      | "rv_RespiratoryVentilator_ModellNo"
      | "rv_RespiratoryVentilator_Type"
      | "rv_RespiratoryVentilator_Manufacturer"
      | "rv_RespiratoryVentilator_Protable"
      | "rv_RespiratoryVentilator_MaxPatients"
      | "rv_RespiratoryVentilator_Description"
      | "rv_location"
    >
  : never;
