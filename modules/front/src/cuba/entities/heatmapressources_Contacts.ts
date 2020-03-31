import { StandardEntity } from "./base/sys$StandardEntity";
export class Contacts extends StandardEntity {
  static NAME = "heatmapressources_Contacts";
  contactName?: string | null;
  contactEmail?: string | null;
  contactPhoneNumber?: string | null;
  contactWebsite?: string | null;
  contactDataSources?: string | null;
}
export type ContactsViewName = "_minimal" | "_local" | "_base";
export type ContactsView<V extends ContactsViewName> = V extends "_minimal"
  ? Pick<Contacts, "id" | "contactName">
  : V extends "_local"
  ? Pick<
      Contacts,
      | "id"
      | "contactName"
      | "contactEmail"
      | "contactPhoneNumber"
      | "contactWebsite"
      | "contactDataSources"
    >
  : V extends "_base"
  ? Pick<
      Contacts,
      | "id"
      | "contactName"
      | "contactEmail"
      | "contactPhoneNumber"
      | "contactWebsite"
      | "contactDataSources"
    >
  : never;
