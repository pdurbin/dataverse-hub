# dataverse-hub - DRAFT - PRIVATE

- [Original issue](https://github.com/IQSS/dataverse-pm/issues/271)
- [Initial working document](https://docs.google.com/document/d/1lPoQLBt0tLjSLz7Jzm_MUxSS5bKu6ZRuoOmFkOGf_FI/edit)
- [HDV metrics](https://docs.google.com/document/d/1AgaLtvCP5t6jmfNYyXoCGXLZVJqNTVD_fTGFKKFC4XY/edit)
- [DV Metrics API](https://guides.dataverse.org/en/4.20/api/metrics.html)
- [Meeting notes](https://docs.google.com/document/d/1DKNXvPLqX3L4sdHnViea1RaAv5kAcPQXh_YXTSWUzeU/edit#heading=h.8ukwaoy3aqdd)
- [Draft document](https://docs.google.com/document/d/1F16ZcGvWW8rnN3pTGS1tH2GK_b84FY_SONKjNh8gnE4/edit?usp=sharing)
- [Draft spreadsheet](https://docs.google.com/spreadsheets/d/1Z4_RVic46Us8xSRcKYOr6aUCxjrff8eLY_UlUCQZeoc/edit?usp=sharing)
- [Draft presentation](https://docs.google.com/presentation/d/1aJlskY7LuuGMxYRkaxenEnKVhf7yxFj2pDnifL67lO4/edit?usp=sharing)
- [Draft diagram](https://www.mermaidchart.com/play?utm_source=mermaid_live_editor&utm_medium=banner_ad&utm_campaign=teams#pako:eNqNVNtugzAM_ZWId35gmia1ZdMq7fLQbdKkvaTBpZmCgxKzCbX99xEKLYHQNW_xMefYJza7SOgUoptIKG5tInlmeP6FrD4LjSQRkLpriWQqdruP4yG2REtcKU5SY4s3yWM0jvd3CSdugcLgQisFwt3C-AcYOwk-SAVTtIhHWsaOGU3D50Z2x6g78RIJMjBMdOAy6aErMhIzhjxvtQ4-YdN5n04i1VRN-DJREz1VNJb3hPodhoq_QqqNpmCFkcXZ8z7oBKhMA58pjdkEtNWWBlpdWYqXKLafwE3Q8LFLc60VcGRZKsRzDvkaTKAFLWclbbWRVI1RZykXxO5zLlXAynYgfRfP7npWe7U91RawBAptJUE6BB65-QHrA7UUOL3w6HSjP3hP5lczqmCWO9_m1aLmzbSppvBVuf6uBQLGv-maf9RYuMx2A4MzN2VU-xDe8v7rh9vmvso0vWz1X0o3Hq-b90JpntoLGYn-xV7O4B26f8UuMIfihK5KIcDaTamGDZ1zZkSQF3TFZJ2WPDr8AbXQwUk)

Statistics to consolidate:

- https://dataverse.org/metrics |
- https://www.iq.harvard.edu/metrics |
- https://dataverse.harvard.edu/
- https://dataverse.org/installations
- https://iqss.github.io/dataverse-installations/charts.html


## Initial Analysis
  
In this analysis, we will explore the discrepancies observed in the metrics reported by three prominent platforms: Dataverse.org, the Institute for Quantitative Social Science (IQSS) at Harvard University, and the Harvard Dataverse. By comparing the data presented on these sites, we aim to identify inconsistencies and understand their potential causes. This investigation will provide insights into the reliability and accuracy of the metrics, ultimately helping to improve data transparency and trustworthiness across these platforms. The result of this analysis will be the creation of the Dataverse Hub, a web application designed to consolidate these metrics into a unified and accessible format.

## Harvard | Dataverse

**Website:** https://dataverse.harvard.edu/

**Source:** [GitHub - *https://github.com/IQSS/dataverse.harvard.edu*](https://github.com/IQSS/dataverse.harvard.edu)


### Data:

#### Subject data
|Data|Type|
|-|-|
|Subject | Number |

#### Activity
|Data|Type|
|-|-|
|Datasets - all - all activity| Number | https://dataverse.harvard.edu/api/info/metrics/datasets?dataLocation=all
|Datasets - all - last 30 days| Number | https://dataverse.harvard.edu/api/info/metrics/datasets/pastDays/30?dataLocation=all
|Datasets - Deposited - all activity| Number | https://dataverse.harvard.edu/api/info/metrics/datasets?dataLocation=local
|Datasets - Deposited - last 30 days| Number | https://dataverse.harvard.edu/api/info/metrics/datasets/pastDays/30?dataLocation=local
|Datasets - Harvested - all activity| Number | https://dataverse.harvard.edu/api/info/metrics/datasets?dataLocation=remote
|Datasets - Harvested - last 30 days| Number | https://dataverse.harvard.edu/api/info/metrics/datasets/pastDays/30?dataLocation=remote

#### Files
|Data|Type|
|-|-|
|Files - Downloaded - all activity| Number | https://dataverse.harvard.edu/api/info/metrics/downloads
|Files - Downloaded - last 30 days| Number | https://dataverse.harvard.edu/api/info/metrics/downloads/pastDays/30
|Files - Deposited - all activity| Number | https://dataverse.harvard.edu/api/info/metrics/files
|Files - Deposited - last 30 days| Number | https://dataverse.harvard.edu/api/info/metrics/files/pastDays/30


___

## Dataverse.org

**Website:** https://metrics.dataverse.org/global/index.html
**Source:** [GitHub - *github.com/IQSS/dataverse-metrics*](https://github.com/IQSS/dataverse-metrics)

### Data:

|Data|Type|
|-|-|
|Total Dataverses | Bar Chart |
|Dataverses by Category| Waffle Chart |
|Total Datasets| Bar Chart | 
|Datasets by Subject| Waffle Chart | 
|Total Files |Bar Chart | 
|Total file downloads | Bar Chart | 
|Instances by Version | Waffle Chart |
|Instances by Version | Bar Chart |
|Source | List | 


### Used on:

#### - metrics.dataverse.org

The data found on metrics.dataverse.org is generated by a Python web application available at https://github.com/IQSS/dataverse-metrics. This application aggregates metrics from various Dataverse installations, providing insights into datasets, downloads, and user activity. It utilizes technologies such as Python, PostgreSQL, Apache Solr, and D3.js to collect, process, and visualize data.

#### - dataverse.org/metrics
Plataform: [OpenScholar - *dataverse.org/metrics*](https://dataverse.org/metrics)

The metrics shown on **dataverse.org/metrics** should match the data available on metrics.dataverse.org. It’s important to note that **dataverse.org/metrics** is an OpenScholar website, and the information presented is merely an iframe.


___

## IQSS

**Website:** https://iqss.github.io/iqss-metrics-dashboard/

**Source:** [GitHub - *github.com/IQSS/iqss-metrics-dashboard*](https://github.com/IQSS/iqss-metrics-dashboard)
**Source:** [GitHub - *github.com/IQSS/iqss-metrics-backend*](https://github.com/IQSS/iqss-metrics-backend)
### Data:


#### Dataverse Worldwide
|Data|Type|
|-|- |
|Installations | Map |
|Top 10 Dataverse Installations by Country | Bar chart | 

#### Metrics
|Data|Type|
|-|- |
|Searchable Datasets (Harvard) | Number |
|Datasets Curated | Number |
|Number of Installations | Number|
|Watchers (GitHub) | Number |
|Subscribers (GitHub) | Number|
|Number of Videos (YouTube) |

#### Dataverse Content
|Data|Type|
|-|- |
|Total Dataverses | Bar chart |
|Dataverses by Category | Waffle chart |
|Total Datasets | Bar chart |
|Dataverses by Subject | Waffle chart |
|Total Files| Bar chart |
|Total File Downloads | Line chart |

#### Dataverse Support
|Data|Type|
|-|- |
|Dataverse Support type | Bar chart |
|Dataverse Support feature type | Bar chart | 
|Total number of Tickets 2023 | Number |

#### Harvard Dataverse
|Data|Type|
|-|- |
|Files Total | Number |
|Files Deposited Last 30 days | Number |
|Datasets Deposited Total | Number |
|Datasets Deposited Last 30 Days | Number |
|Files Downloaded |  Number |
|Files Downloaded Last 30 days | Number |
