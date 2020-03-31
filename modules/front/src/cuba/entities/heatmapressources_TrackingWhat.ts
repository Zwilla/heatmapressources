import { StandardEntity } from "./base/sys$StandardEntity";
export class TrackingWhat extends StandardEntity {
  static NAME = "heatmapressources_TrackingWhat";
  gr_Tracking_This?: string | null;
}
export type TrackingWhatViewName = "_minimal" | "_local" | "_base";
export type TrackingWhatView<
  V extends TrackingWhatViewName
> = V extends "_minimal"
  ? Pick<TrackingWhat, "id" | "gr_Tracking_This">
  : V extends "_local"
  ? Pick<TrackingWhat, "id" | "gr_Tracking_This">
  : V extends "_base"
  ? Pick<TrackingWhat, "id" | "gr_Tracking_This">
  : never;
