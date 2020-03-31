import { StandardEntity } from "./base/sys$StandardEntity";
import { ControlCenter } from "./heatmapressources_ControlCenter";
export class Emergency_Helicopter extends StandardEntity {
  static NAME = "heatmapressources_Emergency_Helicopter";
  eh_Name?: string | null;
  eh_ControlCenter?: ControlCenter | null;
  eh_Emergency_Helicopter_UUID?: string | null;
  eh_location_home?: any | null;
  eh_location_tracking?: any | null;
  eh_location_tracking_source?: string | null;
  eh_contact?: string | null;
}
export type Emergency_HelicopterViewName = "_minimal" | "_local" | "_base";
export type Emergency_HelicopterView<
  V extends Emergency_HelicopterViewName
> = V extends "_minimal"
  ? Pick<Emergency_Helicopter, "id" | "eh_Name">
  : V extends "_local"
  ? Pick<
      Emergency_Helicopter,
      | "id"
      | "eh_Name"
      | "eh_Emergency_Helicopter_UUID"
      | "eh_location_home"
      | "eh_location_tracking"
      | "eh_location_tracking_source"
      | "eh_contact"
    >
  : V extends "_base"
  ? Pick<
      Emergency_Helicopter,
      | "id"
      | "eh_Name"
      | "eh_Emergency_Helicopter_UUID"
      | "eh_location_home"
      | "eh_location_tracking"
      | "eh_location_tracking_source"
      | "eh_contact"
    >
  : never;
