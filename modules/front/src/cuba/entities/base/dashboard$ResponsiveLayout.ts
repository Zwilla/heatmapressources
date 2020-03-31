import { DashboardLayout } from "./dashboard$DashboardLayout";
import { ResponsiveArea } from "./dashboard$ResponsiveArea";
export class ResponsiveLayout extends DashboardLayout {
  static NAME = "dashboard$ResponsiveLayout";
  xs?: number | null;
  sm?: number | null;
  md?: number | null;
  lg?: number | null;
  areas?: ResponsiveArea | null;
}
export type ResponsiveLayoutViewName = "_minimal" | "_local" | "_base";
export type ResponsiveLayoutView<
  V extends ResponsiveLayoutViewName
> = V extends "_minimal"
  ? Pick<ResponsiveLayout, "id" | "caption">
  : V extends "_base"
  ? Pick<ResponsiveLayout, "id" | "caption">
  : never;
