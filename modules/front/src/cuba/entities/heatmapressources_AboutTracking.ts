import { StandardEntity } from "./base/sys$StandardEntity";
export class AboutTracking extends StandardEntity {
  static NAME = "heatmapressources_AboutTracking";
  ts_AboutWhat?: string | null;
  ts_Website?: string | null;
  ts_contact_mail?: string | null;
  ts_contact_phone?: string | null;
  ts_description?: string | null;
}
export type AboutTrackingViewName = "_minimal" | "_local" | "_base";
export type AboutTrackingView<
  V extends AboutTrackingViewName
> = V extends "_minimal"
  ? Pick<AboutTracking, "id" | "ts_AboutWhat">
  : V extends "_local"
  ? Pick<
      AboutTracking,
      | "id"
      | "ts_AboutWhat"
      | "ts_Website"
      | "ts_contact_mail"
      | "ts_contact_phone"
      | "ts_description"
    >
  : V extends "_base"
  ? Pick<
      AboutTracking,
      | "id"
      | "ts_AboutWhat"
      | "ts_Website"
      | "ts_contact_mail"
      | "ts_contact_phone"
      | "ts_description"
    >
  : never;
