import { VerticalLayout } from "./dashboard$VerticalLayout";
export class RootLayout extends VerticalLayout {
  static NAME = "dashboard$RootLayout";
}
export type RootLayoutViewName = "_minimal" | "_local" | "_base";
export type RootLayoutView<V extends RootLayoutViewName> = V extends "_minimal"
  ? Pick<RootLayout, "id" | "caption">
  : V extends "_base"
  ? Pick<RootLayout, "id" | "caption">
  : never;
