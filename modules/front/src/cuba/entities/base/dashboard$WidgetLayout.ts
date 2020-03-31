import { DashboardLayout } from "./dashboard$DashboardLayout";
import { Widget } from "./dashboard$Widget";
export class WidgetLayout extends DashboardLayout {
  static NAME = "dashboard$WidgetLayout";
  widget?: Widget | null;
}
export type WidgetLayoutViewName = "_minimal" | "_local" | "_base";
export type WidgetLayoutView<
  V extends WidgetLayoutViewName
> = V extends "_minimal"
  ? Pick<WidgetLayout, "id" | "caption">
  : V extends "_base"
  ? Pick<WidgetLayout, "id" | "caption">
  : never;
