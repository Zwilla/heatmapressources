import { VerticalLayout } from "./dashboard$VerticalLayout";
export class GridCellLayout extends VerticalLayout {
  static NAME = "dashboard$GridCellLayout";
  row?: number | null;
  column?: number | null;
  colSpan?: number | null;
  rowSpan?: number | null;
}
export type GridCellLayoutViewName = "_minimal" | "_local" | "_base";
export type GridCellLayoutView<
  V extends GridCellLayoutViewName
> = V extends "_minimal"
  ? Pick<GridCellLayout, "id" | "caption">
  : V extends "_base"
  ? Pick<GridCellLayout, "id" | "caption">
  : never;
