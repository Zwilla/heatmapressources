import { DashboardLayout } from "./dashboard$DashboardLayout";
export class HorizontalLayout extends DashboardLayout {
  static NAME = "dashboard$HorizontalLayout";
}
export type HorizontalLayoutViewName = "_minimal" | "_local" | "_base";
export type HorizontalLayoutView<
  V extends HorizontalLayoutViewName
> = V extends "_minimal"
  ? Pick<HorizontalLayout, "id" | "caption">
  : V extends "_base"
  ? Pick<HorizontalLayout, "id" | "caption">
  : never;
