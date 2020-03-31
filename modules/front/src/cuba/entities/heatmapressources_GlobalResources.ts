import { StandardEntity } from "./base/sys$StandardEntity";
import { TrackingWhat } from "./heatmapressources_TrackingWhat";
export class GlobalResources extends StandardEntity {
  static NAME = "heatmapressources_GlobalResources";
  gr_TrackingWhat?: TrackingWhat | null;
  gr_Tracking_URL?: string | null;
}
export type GlobalResourcesViewName = "_minimal" | "_local" | "_base";
export type GlobalResourcesView<
  V extends GlobalResourcesViewName
> = V extends "_minimal"
  ? Pick<GlobalResources, "id" | "gr_TrackingWhat" | "gr_Tracking_URL">
  : V extends "_local"
  ? Pick<GlobalResources, "id" | "gr_Tracking_URL">
  : V extends "_base"
  ? Pick<GlobalResources, "id" | "gr_TrackingWhat" | "gr_Tracking_URL">
  : never;
