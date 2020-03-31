import { StandardEntity } from "./base/sys$StandardEntity";
export class Humans extends StandardEntity {
  static NAME = "heatmapressources_Humans";
  hr_Fullname?: string | null;
  hr_FirstName?: string | null;
  hr_LastName?: string | null;
  hr_Birthday?: any | null;
  hr_ImeiNumber?: string | null;
  hr_phonenumber?: string | null;
  hr_Tracked_Since?: any | null;
  hr_healthState?: string | null;
  hr_Description?: string | null;
  hr_location_Home?: any | null;
  hr_location_Tracking?: any | null;
}
export type HumansViewName = "_minimal" | "_local" | "_base";
export type HumansView<V extends HumansViewName> = V extends "_minimal"
  ? Pick<Humans, "id" | "hr_LastName" | "hr_FirstName">
  : V extends "_local"
  ? Pick<
      Humans,
      | "id"
      | "hr_Fullname"
      | "hr_FirstName"
      | "hr_LastName"
      | "hr_Birthday"
      | "hr_ImeiNumber"
      | "hr_phonenumber"
      | "hr_Tracked_Since"
      | "hr_healthState"
      | "hr_Description"
      | "hr_location_Home"
      | "hr_location_Tracking"
    >
  : V extends "_base"
  ? Pick<
      Humans,
      | "id"
      | "hr_LastName"
      | "hr_FirstName"
      | "hr_Fullname"
      | "hr_Birthday"
      | "hr_ImeiNumber"
      | "hr_phonenumber"
      | "hr_Tracked_Since"
      | "hr_healthState"
      | "hr_Description"
      | "hr_location_Home"
      | "hr_location_Tracking"
    >
  : never;
