## Evaluation Package for our JSS Article "Systematic Derivation of Microservices from Underspecified Domain Models in Continuous Domain-Driven Design"

### Source Code
---
The source code of the Eclipse plugins for Phases 1 to 3 and for the technology models of Phase 4 is part of this repository:
- Phases 1 and 2:
  - [M2M transformation to derive basic LEMMA domain model from input DDD domain model](https://github.com/SeelabFhdo/jss2020/blob/master/Implementation/de.fhdo.lemma.ddmm2lemma/src/de/fhdo/lemma/ddmm2lemma/transformations/domain.atl)
  - M2M transformation bundle for exemplary microservice derivation approach ([domain-related M2M transformation](https://github.com/SeelabFhdo/jss2020/blob/master/Implementation/de.fhdo.lemma.ddmm2lemma/src/de/fhdo/lemma/ddmm2lemma/transformations/domain_services_refinement.atl), [service-related M2M transformation](https://github.com/SeelabFhdo/seaa2020/blob/master/Implementation/de.fhdo.lemma.ddmm2lemma/src/de/fhdo/lemma/ddmm2lemma/transformations/services.atl))
  - [Eclipse plugin](https://github.com/SeelabFhdo/jss2020/tree/master/Implementation/de.fhdo.lemma.ddmm2lemma)
- Phase 3: [Eclipse plugin](https://github.com/SeelabFhdo/jss2020/tree/master/Implementation/de.fhdo.lemma.projections)
- Phase 4:
  - Technology models: [Case Study 1](https://github.com/SeelabFhdo/jss2020/tree/master/Validation/Case%20Study%20Models%20and%20Code/Cargo/Phase%204), [Case Study 2](https://github.com/SeelabFhdo/jss2020/tree/master/Validation/Case%20Study%20Models%20and%20Code/Lakeside%20Mutual/Phase%204), [Case Study 3](https://github.com/SeelabFhdo/jss2020/tree/master/Validation/Case%20Study%20Models%20and%20Code/Modular%20Monolith%20with%20DDD/Phase%204)

The source code of the Java Base Generator and its Genlets is part of [LEMMA's GitHub repository](https://github.com/SeelabFhdo/lemma/tree/master/code%20generators).

### Reproducing the Evaluation Steps
---
The reproduction of the evaluation steps described in Section 5 of the article requires the preparation of a local Eclipse instance:
1. Download Eclipse release 2020-06 (4.16.0) of the [Eclipse IDE for Java and DSL Developers](https://www.eclipse.org/downloads/packages/release/2020-06/r/eclipse-ide-java-and-dsl-developers).
2. Run the downloaded Eclipse release and install the Eclipse Papyrus package for Eclipse 2020-06 from this update site: [http://download.eclipse.org/modeling/mdt/papyrus/updates/releases/2020-06](http://download.eclipse.org/modeling/mdt/papyrus/updates/releases/2020-06).
3. Install the current ATL package from this update site: [https://download.eclipse.org/mmt/atl/updates/releases](https://download.eclipse.org/mmt/atl/updates/releases/).
4. Extract the JAR archives in the [`dropins.zip`](https://github.com/SeelabFhdo/jss2020/blob/master/dropins.zip) file from this repository to the `dropins` folder of the Eclipse release downloaded in Step 1. The JAR archives in the ZIP file are pre-compiled plugins for LEMMA's modeling languages and the plugins mentioned in our article (see above).
5. Restart Eclipse.

For the actual reproduction, please follow these steps:
1. Clone this repository to your harddrive.
2. Run the prepared Eclipse instance (see above).
3. In the running Eclipse instance, import the `Cargo` `Lakeside Mutual`, and `Modular Monolith with DDD` Eclipse projects contained in the cloned [Validation/Case Study Models and Code](https://github.com/SeelabFhdo/jss2020/tree/master/Validation/Case%20Study%20Models%20and%20Code) folder into the current workspace.
4. To review the DDD domain models of **Phase 1** imported by the previous step, switch to the `Cargo/Phase 1`, `Lakeside Mutual/Phase 1`, or `Modular Monolith with DDD/Phase 1` folder in the Eclipse Package Explorer. Double click on the `cargo.di`, `LakesideMutual.di`, or `ModularMonolithWithDDD.di` file. In the opening Welcome window of Papyrus, click on the `CargoDiagram` (Cargo) or `Class Diagram` (Lakeside Mutual, Modular Monolith with DDD) link in the Notation Views section. The Cargo, Lakeside Mutual, or Modular Monolith with DDD input DDD domain model used for evaluating our methodology is shown in Eclipse Papyrus.
5. To review the derived LEMMA models of **Phase 2**, switch to the `Cargo/Phase 2`, `Lakeside Mutual/Phase 2`, or `Modular Monolith with DDD/Phase 2` folder in the Eclipse Package Explorer. The `extracted models` sub-folders contain the derived LEMMA models in their concrete syntax (files with extensions `.data` and `.services`) and abstract syntax (files with extension `.xmi`) representations. Files with the `extracted_`-prefix are overwritten each time when a new transformation on the input DDD domain models is executed.
LEMMA models directly contained in the `extracted models` folder, e.g., `domain.data` and `service.services`, comprise all derived bounded contexts and enclosed domain concepts, and all derived microservices, respectively. LEMMA models contained in a sub-folder of `extracted models` only contain derived elements in the bounded context of the same name as the nested folder, e.g., `Customer` for the Cargo case study's "Customer" and `city` for Lakeside Mutual's "city" bounded context.
The LEMMA models may also be interactively derived leveraging our plugins within the prepared Eclipse instance. To this end, right click on either the `cargo.uml`, `LakesideMutual.uml`, or `ModularMonolithWithDDD.uml` file in the `Cargo/Phase 1`, `Lakeside Mutual/Phase 1`, or `Modular Monolith with DDD/Phase 1` folder in the Eclipse Package Explorer and hit the entry `Extract Editable LEMMA Models` in the opening context menu. This entry will invoke the Eclipse Handler [DdmmToLemmaTransformationHandler](https://github.com/SeelabFhdo/jss2020/blob/master/Implementation/de.fhdo.lemma.ddmm2lemma/src/de/fhdo/lemma/ddmm2lemma/DdmmToLemmaTransformationHandler.xtend) from the plugin for Phases 1 and 2 (see above). The Handler executes the M2M transformations of Phases 1 and 2 (see above) on the input DDD domain model in the selected `.uml` file. Next, the plugin leverages the [Projections class](https://github.com/SeelabFhdo/jss2020/blob/master/Implementation/de.fhdo.lemma.projections/src/de/fhdo/lemma/projections/Projections.xtend) of the plugin for Phase 3 (see above) to extract the in-memory LEMMA models to their concrete syntax representations via an M2T transformation. Upon successful extraction, a message box will appear to inform the modeler that the LEMMA models were successfully extracted. You can then find the extracted models in the `Cargo/extracted models`, `Lakeside Mutual/extracted models`, or `Modular Monolith with DDD/extracted models` folders in the Eclipse Package Explorer. The contents of the folders are identical to the contents of the `Cargo/Phase 2/extracted models`, `Lakeside Mutual/Phase 2/extracted models`, and `Modular Monolith with DDD/Phase 2/extracted models` sub-folders.
The configuration of an M2M transformation bundle for Phase 2 happens via the Eclipse menu entry `Window > Preferences > DDMM2LEMMA Configuration`. The first option allows for exchanging the domain-related M2M transformation of the bundle to execute. The second option allows for exchanging the bundle's service-related M2M transformation. The default values of both configuration options point to the M2M transformation of our exemplary microservice derivation approach (see above). The third option allows for changing the output path of the M2T extraction to something else than `extracted models`.
6. To review the adapted LEMMA models of **Phase 3**, navigate to the `Cargo/Phase 3`, `Lakeside Mutual/Phase 3`, or `Modular Monolith with DDD/Phase 3` folders in the Eclipse Package Explorer. We copied the contents of the folders from the `extracted models` folders derived in Phase 2 and removed the files with the `extracted_`-prefix to improve clarity. Comments in the model files identify the model adaptation actions, e.g., "// D1" and "// S3", and places were adaptation actions took place.
7. The mapping models for **Phase 4** may be found in the `Cargo/Phase 4`, `Lakeside Mutual/Phase 4`, or `Modular Monolith with DDD/Phase 4` folders in the Eclipse Package Explorer. The generated Java code is contained in the `generated code` sub-folders.
If you are interested in generating the Java and Spring code yourself, execute the `generate_code.sh` Bash script in the `Cargo`, `Lakeside Mutual`, or `Modular Monolith with DDD` folders cloned from the repository. They will execute the generator's standalone fat JAR from the cloned [Validation/libs](https://github.com/SeelabFhdo/seaa2020/tree/master/Validation/libs) folder. For the generator to run, you need at least Java 12. To temporarily set your Java version to at least 12, you may adapt the `export_java_home.sh` Bash script in the `Cargo`, `Lakeside Mutual`, or `Modular Monolith with DDD` folders. Please note that the `generate_code.sh` Bash scripts also starts the generated microservices at ports beginning with 8080. If you only want to generate the code without the microservices to start, pass the "compile_only" option to the scripts.

### Retrieving the Evaluation Results
---
In order to retrieve the evaluation results mentioned in the Section 5 of the article, review or execute the scripts from the cloned [Validation/Analysis](https://github.com/SeelabFhdo/jss2020/tree/master/Validation/Analysis) folder corresponding to the different phases of our methodology. For the majority of the scripts to run, you need Python 3 and the [`cloc` utility](https://github.com/AlDanial/cloc) for automated LOC counting.
