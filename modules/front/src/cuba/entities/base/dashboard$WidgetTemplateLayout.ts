import { WidgetLayout } from "./dashboard$WidgetLayout";
export class WidgetTemplateLayout extends WidgetLayout {
  static NAME = "dashboard$WidgetTemplateLayout";
}
export type WidgetTemplateLayoutViewName = "_minimal" | "_local" | "_base";
export type WidgetTemplateLayoutView<
  V extends WidgetTemplateLayoutViewName
> = V extends "_minimal"
  ? Pick<WidgetTemplateLayout, "id" | "caption">
  : V extends "_base"
  ? Pick<WidgetTemplateLayout, "id" | "caption">
  : never;
