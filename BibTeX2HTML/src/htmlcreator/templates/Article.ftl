<#list ArticleList as ArticleData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${ArticleData.citationKey}</li>
			<li><strong>Author:</strong> ${ArticleData.author}</li>
			<li><strong>Title:</strong> ${ArticleData.title}</li>
			<li><strong>Journal:</strong> ${ArticleData.journal}</li>
			<li><strong>Year:</strong> ${ArticleData.year}</li>
			<#if ArticleData.volume??>
				<li><strong>Volume:</strong> ${ArticleData.volume}</li>
			</#if>
			<#if ArticleData.number??>
				<li><strong>Number:</strong> ${ArticleData.number}</li>
			</#if>
			<#if ArticleData.pages??>
				<li><strong>Pages:</strong> ${ArticleData.pages}</li>
			</#if>
			<#if ArticleData.month??>
				<li><strong>Month:</strong> ${ArticleData.month}</li>
			</#if>
			<#if ArticleData.note??>
				<li><strong>Note:</strong> ${ArticleData.note}</li>
			</#if>
			<#if ArticleData.key??>
				<li><strong>Key:</strong> ${ArticleData.key}</li>
			</#if>
			<#if ArticleData.crossref??>
				<li><strong>Crossref:</strong> ${ArticleData.crossref}</li>
			</#if>			
		</ul>
	</div>
</#list>